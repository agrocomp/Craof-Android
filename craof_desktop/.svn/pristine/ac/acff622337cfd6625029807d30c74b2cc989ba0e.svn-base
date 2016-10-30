package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.entidade.craof.Cultura;
import org.entidade.usuario.Usuario;
import util.Conexao;

public class CulturaDAO {

    public boolean salvar(Cultura cultura) throws SQLException {
        String sql = "INSERT INTO cultura (nome, id_usuario) VALUES (?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, cultura.getNome());
        ps.setObject(2, cultura.getId_usuario());
        boolean cadastrou = ps.execute();
        Conexao.setConnection();
        return cadastrou;
    }

    public Cultura buscarId(Cultura cultura, Usuario usuario) throws SQLException {
        int max = 0;
        String sql = "SELECT * from cultura WHERE nome = ? AND id_usuario = ?";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, cultura.getNome());
        ps.setObject(2, usuario.getId());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            cultura.setCodigo(rs.getInt("id_cultura"));
        }
        Conexao.setConnection();
        return cultura;
    }

    public ArrayList<Cultura> procurarCultura(Cultura cultura, Usuario usuario) throws SQLException {
        ArrayList<Cultura> listaCultura = new ArrayList();
        String sql = "SELECT * FROM cultura WHERE upper(nome) LIKE '" + cultura.getNome() + "%' AND id_usuario = " + usuario.getId();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Cultura aux = new Cultura();
            aux.setCodigo(rs.getInt("id_cultura"));
            aux.setNome(rs.getString("nome"));
            aux.setId_usuario(rs.getInt("id_usuario"));
            listaCultura.add(aux);
        }
        Conexao.setConnection();
        return listaCultura;
    }

    public ArrayList<Cultura> buscarTodos(Usuario usuario) throws SQLException {
        ArrayList<Cultura> listaCultura = new ArrayList();
        String sql = "SELECT * FROM cultura WHERE id_usuario = " + usuario.getId();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Cultura aux = new Cultura();
            aux.setCodigo(rs.getInt("id_cultura"));
            aux.setNome(rs.getString("nome"));
            aux.setId_usuario(rs.getInt("id_usuario"));
            listaCultura.add(aux);
        }
        Conexao.setConnection();
        return listaCultura;
    }

    public boolean alterar(Cultura cultura, String nomeNovo) throws SQLException {
        String sql = "UPDATE cultura SET nome = '" + nomeNovo + "' WHERE id_cultura = " + cultura.getCodigo();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        boolean alterou = ps.execute();
        Conexao.setConnection();
        return alterou;
    }

    public boolean excluir(String id_cultura) throws SQLException {
        String sql = "DELETE FROM cultura WHERE id_cultura = " + id_cultura;
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        boolean deletou = ps.execute();
        Conexao.setConnection();
        return deletou;
    }

    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_cultura) FROM cultura";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
