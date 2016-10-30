package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.entidade.craof.Insumo;
import util.Conexao;

public class InsumoDAO {

    public boolean salvar(Insumo insumo) throws SQLException {
        String sql = "INSERT INTO insumo (descricao, id_usuario, flag_producao, alterado) VALUES (?,?,?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, insumo.getDescricao());
        ps.setObject(2, insumo.getId_usuario());
        ps.setObject(3, insumo.getFlagProducao());
        ps.setObject(4, insumo.getAlterado());
        boolean cadastrou = ps.execute();
        Conexao.setConnection();
        if (insumo.getFlagProducao()) {
            int id_insumo = buscarId(insumo);
            System.out.println("id_insumo: "+ id_insumo);
            for (int i = 0; i < insumo.getListaInsumo().size(); i++) {
                sql = "INSERT INTO ingrediente VALUES (?,?)";
                ps = Conexao.getConnection().prepareStatement(sql);
                ps.setObject(1, id_insumo);
                ps.setObject(2, insumo.getListaInsumo().get(i).getId_insumo());
                cadastrou = ps.execute();
            }
        }
        return cadastrou;
    }

    public ArrayList<Insumo> buscarTodos(Insumo insumo) throws SQLException {
        ArrayList<Insumo> listaInsumo = new ArrayList();
        String sql = null;
        if (insumo.getFlagProducao() == null) {
            sql = "SELECT id_insumo, descricao FROM insumo WHERE upper(descricao) LIKE '" + insumo.getDescricao() + "%' AND id_usuario = " + insumo.getId_usuario();
        } else if (insumo.getFlagProducao()) {
            sql = "SELECT id_insumo, descricao FROM insumo WHERE upper(descricao) LIKE '" + insumo.getDescricao() + "%' AND id_usuario = " + insumo.getId_usuario()
                    + "AND flag_producao = 'true'";
        } else {
            sql = "SELECT id_insumo, descricao FROM insumo WHERE upper(descricao) LIKE '" + insumo.getDescricao() + "%' AND id_usuario = " + insumo.getId_usuario()
                    + "AND flag_producao = 'false'";
        }

        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Insumo aux = new Insumo();
            aux.setId_insumo(rs.getInt("id_insumo"));
            aux.setDescricao(rs.getString("descricao"));
            listaInsumo.add(aux);
        }
        Conexao.setConnection();
        return listaInsumo;
    }

    public int buscarId(Insumo insumo) throws SQLException {
        int max = 0;
        String sql = "SELECT id_insumo from insumo WHERE descricao = ? AND id_usuario = ?";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, insumo.getDescricao());
        ps.setObject(2, insumo.getId_usuario());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt("id_insumo");
        }
        Conexao.setConnection();
        return max;
    }

    public Insumo buscarById(int id_insumo) throws SQLException {
        Insumo insumo = new Insumo();
        String sql = "SELECT * FROM insumo WHERE id_insumo = ?";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, id_insumo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            insumo.setId_insumo(rs.getInt("id_insumo"));
            insumo.setDescricao(rs.getString("descricao"));
            insumo.setId_usuario(rs.getInt("id_usuario"));
            insumo.setFlagProducao(rs.getBoolean("flag_producao"));
        }
        Conexao.setConnection();
        return insumo;
    }

    public ArrayList<Insumo> buscarTodosItens(Insumo insumo) throws SQLException {
        ArrayList<Insumo> listaInsumo = new ArrayList();
        String sql = "SELECT ing.id_ingrediente, ins.descricao FROM ingrediente ing, insumo ins WHERE ing.id_ingrediente = ins.id_insumo AND ing.id_insumo = " + insumo.getId_insumo();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Insumo aux = new Insumo();
            aux.setId_insumo(rs.getInt("id_ingrediente"));
            aux.setDescricao(rs.getString("descricao"));
            listaInsumo.add(aux);
        }
        System.out.println("size: " + listaInsumo.size());
        Conexao.setConnection();
        return listaInsumo;
    }

    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_insumo) FROM insumo";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
