package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.org.entidade.craof.Insumo;


public class InsumoDAO {

    public boolean salvar(Insumo insumo) throws SQLException {
        String sql = "INSERT INTO insumo (descricao, id_usuario, flag_producao) VALUES (?,?,?)";

        return false;
    }

    public ArrayList<Insumo> buscarTodos(Insumo insumo) throws SQLException {
        ArrayList<Insumo> listaInsumo = new ArrayList();
        String sql = null;
        if(insumo.getFlagProducao() == null){
          sql = "SELECT id_insumo, descricao FROM insumo WHERE upper(descricao) LIKE '" + insumo.getDescricao() + "%' AND id_usuario = " + insumo.getId_usuario();
        }else if(insumo.getFlagProducao()){
            sql = "SELECT id_insumo, descricao FROM insumo WHERE upper(descricao) LIKE '" + insumo.getDescricao() + "%' AND id_usuario = " + insumo.getId_usuario() +
                    "AND flag_producao = 'true'";
        }else{
            sql = "SELECT id_insumo, descricao FROM insumo WHERE upper(descricao) LIKE '" + insumo.getDescricao() + "%' AND id_usuario = " + insumo.getId_usuario() +
                    "AND flag_producao = 'false'";
        }
        

        return listaInsumo;
    }

    public int buscarId(Insumo insumo) throws SQLException {
        int max = 0;
        String sql = "SELECT id_insumo from insumo WHERE descricao = ? AND id_usuario = ?";

        return max;
    }

    public Insumo buscarById(int id_insumo) throws SQLException {
        Insumo insumo = new Insumo();
        String sql = "SELECT * FROM insumo WHERE id_insumo = ?";

        return insumo;
    }
    
    public ArrayList<Insumo> buscarTodosItens(Insumo insumo) throws SQLException{
        ArrayList<Insumo> listaInsumo = new ArrayList();
        String sql = "SELECT ing.id_ingrediente, ins.descricao FROM ingrediente ing, insumo ins WHERE ing.id_ingrediente = ins.id_insumo AND ing.id_insumo = " + insumo.getId_insumo();

        return listaInsumo;
    }
}
