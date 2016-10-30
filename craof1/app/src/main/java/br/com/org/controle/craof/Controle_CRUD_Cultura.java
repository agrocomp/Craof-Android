package br.com.org.controle.craof;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.org.entidade.DAO.craof.CulturaDAO;
import br.com.org.entidade.Usuario;
import br.com.org.entidade.craof.Cultura;


public class Controle_CRUD_Cultura {

    public Integer cadastrarCultura(Cultura cultura, Usuario usuario) throws SQLException {
        CulturaDAO culturaDAO = new CulturaDAO();
        return 0;
    }

    public ArrayList<String> buscarTodos() {
        CulturaDAO culturaDAO = new CulturaDAO();
        return culturaDAO.buscarTodos(null);
    }
    
    public ArrayList<Cultura> procurarCultura(Cultura cultura, Usuario usuario) throws SQLException{
        CulturaDAO culturaDAO = new CulturaDAO();
        return culturaDAO.procurarCultura(cultura, usuario);
    }

    public boolean alterarCultura(Cultura cultura, String nomeNovo) throws SQLException{
        CulturaDAO culturaDAO = new CulturaDAO();
        return culturaDAO.alterar(cultura, nomeNovo);
    }

    public boolean excluirCultura(String id_cultura) throws SQLException{
        CulturaDAO culturaDAO = new CulturaDAO();
        return culturaDAO.excluir(id_cultura);
    }
}
