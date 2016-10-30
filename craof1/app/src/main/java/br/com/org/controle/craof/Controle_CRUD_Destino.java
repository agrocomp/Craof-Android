package br.com.org.controle.craof;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.org.entidade.DAO.craof.DestinoDAO;
import br.com.org.entidade.Usuario;
import br.com.org.entidade.craof.LocalDestino;


public class Controle_CRUD_Destino {

    public Integer cadastrar(LocalDestino localDestino, Usuario usuario) throws SQLException {
        DestinoDAO localDestinoDAO = new DestinoDAO();
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
        DestinoDAO localDestinoDAO = new DestinoDAO();
        return localDestinoDAO.buscarId(localDestino, usuario);
    }

    public ArrayList<LocalDestino> buscarTodos(LocalDestino localDestino, Usuario usuario) throws SQLException {
        DestinoDAO localDestinoDAO = new DestinoDAO();
        return localDestinoDAO.procurar(localDestino, usuario);
    }

    public boolean alterar(LocalDestino localDestino, String nomeNovo) throws SQLException {
        DestinoDAO localDestinoDAO = new DestinoDAO();
        return localDestinoDAO.alterar(localDestino, nomeNovo);
    }

    public boolean excluir(String id_localDestino) throws SQLException {
        DestinoDAO localDestinoDAO = new DestinoDAO();
        return localDestinoDAO.excluir(id_localDestino);
    }
}
