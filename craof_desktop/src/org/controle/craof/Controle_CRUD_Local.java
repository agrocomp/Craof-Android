package org.controle.craof;

import java.sql.SQLException;
import java.util.ArrayList;
import org.entidade.DAO.craof.CulturaDAO;
import org.entidade.DAO.craof.LocalPlantioDAO;
import org.entidade.craof.Cultura;
import org.entidade.craof.LocalPlantio;
import org.entidade.usuario.Usuario;

public class Controle_CRUD_Local {

    LocalPlantioDAO localPlantioDAO = new LocalPlantioDAO();

    public Integer cadastrar(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
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
        return localPlantioDAO.buscarId(localPlantio, usuario);
    }

    public ArrayList<LocalPlantio> buscarTodos(LocalPlantio localPlantio, Usuario usuario) throws SQLException {
        return localPlantioDAO.procurar(localPlantio, usuario);
    }

    public boolean alterar(LocalPlantio localPlantio, String nomeNovo) throws SQLException {
        return localPlantioDAO.alterar(localPlantio, nomeNovo);
    }

    public boolean excluir(String id_cultura) throws SQLException {
        return localPlantioDAO.excluir(id_cultura);
    }
    
    public String maximoId() throws SQLException{
        return localPlantioDAO.maximoId() + "";
    }
}
