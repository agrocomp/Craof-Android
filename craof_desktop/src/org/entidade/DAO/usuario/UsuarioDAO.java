package org.entidade.DAO.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.entidade.usuario.Usuario;
import util.Conexao;

public class UsuarioDAO {
    public boolean autenticar(Usuario usuario) throws SQLException{
        String sql = "SELECT * from usuario WHERE email = ? AND senha= ?";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, usuario.getEmail());
        ps.setObject(2, usuario.getSenha());
        ResultSet rs = ps.executeQuery();
        boolean achou = false;
        while (rs.next()) {
            achou = true;
        }
        System.out.println(achou);
        Conexao.setConnection();
        return achou;
    }
}
