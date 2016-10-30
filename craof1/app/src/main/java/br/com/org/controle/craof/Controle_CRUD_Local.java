package br.com.org.controle.craof;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.org.entidade.DAO.craof.LocalPlantioDAO;
import br.com.org.entidade.Usuario;
import br.com.org.entidade.craof.LocalPlantio;


public class Controle_CRUD_Local {

    public Integer cadastrar(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        LocalPlantioDAO localPlantioDAO = new LocalPlantioDAO();
        ArrayList<LocalPlantio> listaLocalPlantio = localPlantioDAO.buscarTodos(usuario);
        Boolean contem = false;
        for (LocalPlantio aux : listaLocalPlantio) {
            if (aux.getDescricao().toUpperCase().equals(localPlantio.getDescricao().toUpperCase())) {
                contem = true;
                break;
            }
        }
        if (!contem) {
            Boolean cadastrado = localPlantioDAO.salvar(localPlantio);
            return cadastrado.compareTo(false);
        } else {
            return 2;
        }
    }

    public LocalPlantio buscarId(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        LocalPlantioDAO localPlantioDAO = new LocalPlantioDAO();
        return localPlantioDAO.buscarId(localPlantio, usuario);
    }

    public ArrayList<LocalPlantio> buscarTodos(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        LocalPlantioDAO localPlantioDAO = new LocalPlantioDAO();
        return localPlantioDAO.procurar(localPlantio, usuario);
    }

    public boolean alterar(LocalPlantio localPlantio, String nomeNovo) throws SQLException {
        LocalPlantioDAO localPlantioDAO = new LocalPlantioDAO();
        return localPlantioDAO.alterar(localPlantio, nomeNovo);
    }

    public boolean excluir(String id_cultura) throws SQLException {
        LocalPlantioDAO localPlantioDAO = new LocalPlantioDAO();
        return localPlantioDAO.excluir(id_cultura);
    }

}
