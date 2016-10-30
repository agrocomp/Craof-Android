package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.entidade.craof.Cultura;
import org.entidade.craof.LocalPlantio;
import org.entidade.usuario.Usuario;
import util.Conexao;

public class LocalPlantioDAO {

    public boolean salvar(LocalPlantio localPlantio) throws SQLException {
        String sql = "INSERT INTO local_plantio (descricao, id_usuario) VALUES (?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, localPlantio.getDescricao());
        ps.setObject(2, localPlantio.getId_usuario());
        boolean cadastrou = ps.execute();
        Conexao.setConnection();
        return cadastrou;
    }

    public LocalPlantio buscarId(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        int max = 0;
        String sql = "SELECT * from local_plantio WHERE descricao = ? AND id_usuario = ?";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, localPlantio.getDescricao());
        ps.setObject(2, usuario.getId());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            localPlantio.setId_localPlantio(rs.getInt("id_local_plantio"));
        }
        Conexao.setConnection();
        return localPlantio;
    }

    public ArrayList<LocalPlantio> procurar(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        ArrayList<LocalPlantio> listaLocalPlantio = new ArrayList();
        String sql = "SELECT * FROM local_plantio WHERE upper(descricao) LIKE '" + localPlantio.getDescricao()+ "%' AND id_usuario = " + usuario.getId();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalPlantio aux = new LocalPlantio();
            aux.setId_localPlantio(rs.getInt("id_local_plantio"));
            aux.setDescricao(rs.getString("descricao"));
            aux.setId_usuario(rs.getInt("id_usuario"));
            listaLocalPlantio.add(aux);
        }
        Conexao.setConnection();
        return listaLocalPlantio;
    }

    public ArrayList<LocalPlantio> buscarTodos(Usuario usuario) throws SQLException {
        ArrayList<LocalPlantio> listaLocalPlantio = new ArrayList();
        String sql = "SELECT * FROM local_plantio WHERE id_usuario = " + usuario.getId();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalPlantio aux = new LocalPlantio();
            aux.setId_localPlantio(rs.getInt("id_local_plantio"));
            aux.setDescricao(rs.getString("descricao"));
            aux.setId_usuario(rs.getInt("id_usuario"));
            listaLocalPlantio.add(aux);
        }
        Conexao.setConnection();
        return listaLocalPlantio;
    }

    public boolean alterar(LocalPlantio localPlantio, String nomeNovo) throws SQLException {
        String sql = "UPDATE local_plantio SET descricao = '" + nomeNovo + "' WHERE id_local_plantio = " + localPlantio.getId_localPlantio();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        boolean alterou = ps.execute();
        Conexao.setConnection();
        return alterou;
    }

    public boolean excluir(String id_localPlantio) throws SQLException {
        String sql = "DELETE FROM local_plantio WHERE id_local_plantio = " + id_localPlantio;
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        boolean deletou = ps.execute();
        Conexao.setConnection();
        return deletou;
    }
    
    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_local_plantio) FROM local_plantio";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
