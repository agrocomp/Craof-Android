package org.controle.craof;

import java.sql.SQLException;
import java.util.ArrayList;
import org.entidade.DAO.craof.DestinoDAO;
import org.entidade.DAO.craof.LocalPlantioDAO;
import org.entidade.craof.LocalDestino;
import org.entidade.craof.LocalPlantio;
import org.entidade.usuario.Usuario;

public class Controle_CRUD_Destino {

    DestinoDAO localDestinoDAO = new DestinoDAO();

    public Integer cadastrar(LocalDestino localDestino, Usuario usuario) throws SQLException {
        ArrayList<LocalDestino> listaLocalDestino = localDestinoDAO.buscarTodos(usuario);
        Boolean contem = false;
        for (LocalDestino aux : listaLocalDestino) {
            if (aux.getDescricao().toUpperCase().equals(localDestino.getDescricao().toUpperCase())) {
                contem = true;
                break;
            }
        }
        if (!contem) {
            Boolean cadastrado = localDestinoDAO.salvar(localDestino);
            return cadastrado.compareTo(false);
        } else {
            return 2;
        }
    }

    public LocalDestino buscarId(LocalDestino localDestino, Usuario usuario) throws SQLException {
        return localDestinoDAO.buscarId(localDestino, usuario);
    }

    public ArrayList<LocalDestino> buscarTodos(LocalDestino localDestino, Usuario usuario) throws SQLException {
        return localDestinoDAO.procurar(localDestino, usuario);
    }

    public boolean alterar(LocalDestino localDestino, String nomeNovo) throws SQLException {
        return localDestinoDAO.alterar(localDestino, nomeNovo);
    }

    public boolean excluir(String id_localDestino) throws SQLException {
        return localDestinoDAO.excluir(id_localDestino);
    }
    
    public String maximoId() throws SQLException{
        return localDestinoDAO.maximoId() + "";
    }
}
