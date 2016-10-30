package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.entidade.craof.LocalDestino;
import org.entidade.usuario.Usuario;
import util.Conexao;

public class DestinoDAO {

    public boolean salvar(LocalDestino localDestino) throws SQLException {
        String sql = "INSERT INTO local_destino (descricao, id_usuario) VALUES (?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, localDestino.getDescricao());
        ps.setObject(2, localDestino.getId_usuario());
        boolean cadastrou = ps.execute();
        Conexao.setConnection();
        return cadastrou;
    }

    public LocalDestino buscarId(LocalDestino localDestino, Usuario usuario) throws SQLException {
        int max = 0;
        String sql = "SELECT * from local_destino WHERE descricao = ? AND id_usuario = ?";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, localDestino.getDescricao());
        ps.setObject(2, usuario.getId());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            localDestino.setId_localDestino(rs.getInt("id_local_destino"));
        }
        Conexao.setConnection();
        return localDestino;
    }

    public ArrayList<LocalDestino> procurar(LocalDestino localDestino, Usuario usuario) throws SQLException {
        ArrayList<LocalDestino> listaLocalDestino = new ArrayList();
        String sql = "SELECT * FROM local_destino WHERE upper(descricao) LIKE '" + localDestino.getDescricao() + "%' AND id_usuario = " + usuario.getId();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalDestino aux = new LocalDestino();
            aux.setId_localDestino(rs.getInt("id_local_destino"));
            aux.setDescricao(rs.getString("descricao"));
            aux.setId_usuario(rs.getInt("id_usuario"));
            listaLocalDestino.add(aux);
        }
        Conexao.setConnection();
        return listaLocalDestino;
    }

    public ArrayList<LocalDestino> buscarTodos(Usuario usuario) throws SQLException {
        ArrayList<LocalDestino> listaLocalDestino = new ArrayList();
        String sql = "SELECT * FROM local_destino WHERE id_usuario = " + usuario.getId();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalDestino aux = new LocalDestino();
            aux.setId_localDestino(rs.getInt("id_local_destino"));
            aux.setDescricao(rs.getString("descricao"));
            aux.setId_usuario(rs.getInt("id_usuario"));
            listaLocalDestino.add(aux);
        }
        Conexao.setConnection();
        return listaLocalDestino;
    }

    public boolean alterar(LocalDestino localDestino, String nomeNovo) throws SQLException {
        String sql = "UPDATE local_destino SET descricao = '" + nomeNovo + "' WHERE id_local_destino = " + localDestino.getId_localDestino();
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        boolean alterou = ps.execute();
        Conexao.setConnection();
        return alterou;
    }

    public boolean excluir(String id_localDestino) throws SQLException {
        String sql = "DELETE FROM local_destino WHERE id_local_destino = " + id_localDestino;
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        boolean deletou = ps.execute();
        Conexao.setConnection();
        return deletou;
    }
    
    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_local_destino) FROM local_destino";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
