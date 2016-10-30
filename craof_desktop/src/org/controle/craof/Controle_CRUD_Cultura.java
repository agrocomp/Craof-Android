package org.controle.craof;

import java.sql.SQLException;
import java.util.ArrayList;
import org.entidade.DAO.craof.CulturaDAO;
import org.entidade.craof.Cultura;
import org.entidade.usuario.Usuario;

public class Controle_CRUD_Cultura {

    CulturaDAO culturaDAO = new CulturaDAO();

    public Integer cadastrarCultura(Cultura cultura, Usuario usuario) throws SQLException {
        ArrayList<Cultura> cult = culturaDAO.buscarTodos(usuario);
        Boolean contem = false;
        for (Cultura aux : cult) {
            if (aux.getNome().toUpperCase().equals(cultura.getNome().toUpperCase())) {
                contem = true;
                break;
            }
        }
        if (!contem) {
            Boolean cadastrado = culturaDAO.salvar(cultura);
            return cadastrado.compareTo(false);
        } else {
            return 2;
        }
    }

    public Cultura buscarCultura(Cultura cultura, Usuario usuario) throws SQLException {
        return culturaDAO.buscarId(cultura, usuario);
    }

    public ArrayList<Cultura> procurarCultura(Cultura cultura, Usuario usuario) throws SQLException {
        return culturaDAO.procurarCultura(cultura, usuario);
    }

    public boolean alterarCultura(Cultura cultura, String nomeNovo) throws SQLException {
        return culturaDAO.alterar(cultura, nomeNovo);
    }

    public boolean excluirCultura(String id_cultura) throws SQLException {
        return culturaDAO.excluir(id_cultura);
    }
    
    public String maximoId() throws SQLException{
        return culturaDAO.maximoId() + "";
    }
}
