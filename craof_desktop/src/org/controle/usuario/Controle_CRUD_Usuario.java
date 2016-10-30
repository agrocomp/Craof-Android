package org.controle.usuario;

import java.sql.SQLException;
import org.entidade.DAO.usuario.UsuarioDAO;
import org.entidade.usuario.Usuario;

public class Controle_CRUD_Usuario {

    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean autenticar(Usuario usuario) throws SQLException {
        return usuarioDAO.autenticar(usuario);
    }
}
