package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.org.entidade.Usuario;
import br.com.org.entidade.craof.Cultura;


public class CulturaDAO {

    public boolean salvar(Cultura cultura) throws SQLException {
        String sql = "INSERT INTO cultura (nome, id_usuario) VALUES (?,?)";

        boolean cadastrou = false;
        return cadastrou;
    }

    public Cultura buscarId(Cultura cultura, Usuario usuario) throws SQLException {
        int max = 0;
        String sql = "SELECT * from cultura WHERE nome = ? AND id_usuario = ?";

        return cultura;
    }

    public ArrayList<Cultura> procurarCultura(Cultura cultura, Usuario usuario) throws SQLException {
        ArrayList<Cultura> listaCultura = new ArrayList();
        String sql = "SELECT * FROM cultura WHERE upper(nome) LIKE '"+ cultura.getNome() + "%' AND id_usuario = " + usuario.getId();

        return listaCultura;
    }
    
    public ArrayList<String> buscarTodos(Usuario usuario){
        ArrayList<String> listaCultura = new ArrayList();
       // String sql = "SELECT * FROM cultura WHERE id_usuario = " + usuario.getId();
        listaCultura.add("teste");
        return listaCultura;
    }
    
    public boolean alterar(Cultura cultura, String nomeNovo) throws SQLException{
        String sql = "UPDATE cultura SET nome = '" + nomeNovo +"' WHERE id_cultura = " + cultura.getCodigo();

        return false;
    }
    
    public boolean excluir(String id_cultura) throws SQLException{
        String sql = "DELETE FROM cultura WHERE id_cultura = " + id_cultura;

        return false;
    }
}
