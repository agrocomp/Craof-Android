package br.com.org.controle.craof;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.org.entidade.DAO.craof.InsumoDAO;
import br.com.org.entidade.craof.Insumo;

public class Controle_CRUD_Insumo {

    InsumoDAO insumoDAO = new InsumoDAO();

    public boolean salvar(Insumo insumo) throws SQLException {
        return insumoDAO.salvar(insumo);
    }

    public ArrayList<Insumo> buscarTodos(Insumo insumo) throws SQLException {
        return insumoDAO.buscarTodos(insumo);
    }

    public Integer buscarId(Insumo insumo) throws SQLException {
        return insumoDAO.buscarId(insumo);
    }

    public Insumo buscarById(int id_insumo) throws SQLException {
        return insumoDAO.buscarById(id_insumo);
    }
    
    public ArrayList<Insumo> buscarTodosItens(Insumo insumo) throws SQLException{
        return insumoDAO.buscarTodosItens(insumo);
    }
}
