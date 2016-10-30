package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.org.entidade.Usuario;
import br.com.org.entidade.craof.LocalPlantio;


public class LocalPlantioDAO {

    public boolean salvar(LocalPlantio localPlantio) throws SQLException {
        String sql = "INSERT INTO local_plantio (descricao, id_usuario) VALUES (?,?)";

        return false;
    }

    public LocalPlantio buscarId(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        int max = 0;
        String sql = "SELECT * from local_plantio WHERE descricao = ? AND id_usuario = ?";

        return localPlantio;
    }

    public ArrayList<LocalPlantio> procurar(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        ArrayList<LocalPlantio> listaLocalPlantio = new ArrayList();
        String sql = "SELECT * FROM local_plantio WHERE upper(descricao) LIKE '" + localPlantio.getDescricao()+ "%' AND id_usuario = " + usuario.getId();

        return listaLocalPlantio;
    }

    public ArrayList<LocalPlantio> buscarTodos(Usuario usuario) throws SQLException {
        ArrayList<LocalPlantio> listaLocalPlantio = new ArrayList();
        String sql = "SELECT * FROM local_plantio WHERE id_usuario = " + usuario.getId();

        return listaLocalPlantio;
    }

    public boolean alterar(LocalPlantio localPlantio, String nomeNovo) throws SQLException {
        String sql = "UPDATE local_plantio SET descricao = '" + nomeNovo + "' WHERE id_local_plantio = " + localPlantio.getId_localPlantio();

        return false;
    }

    public boolean excluir(String id_localPlantio) throws SQLException {
        String sql = "DELETE FROM local_plantio WHERE id_local_plantio = " + id_localPlantio;

        return false;
    }
}
