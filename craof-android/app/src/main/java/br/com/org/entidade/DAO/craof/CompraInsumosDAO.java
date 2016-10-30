package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.org.entidade.craof.CompraInsumos;

public class CompraInsumosDAO {

    public boolean salvar(CompraInsumos compraInsumos) throws SQLException {
        String sql = "INSERT INTO compra_insumos (data, id_insumo, quantidade, finalidade, id_usuario) VALUES (?,?,?,?,?)";

        return false;
    }

    public int buscarId(String descricao) throws SQLException {
        int max = 0;
        String sql = "SELECT * FROM insumo WHERE descricao = '" + descricao + "'";

        return max;
    }

    public ArrayList<CompraInsumos> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<CompraInsumos> listaCompraInsumos = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        System.out.println("di: " + dataInicial);
        System.out.println("df: " + dataFinal);
        String sql = "SELECT ci.id_compra_insumo, ci.data, i.descricao, ci.quantidade, ci.finalidade FROM compra_insumos ci, insumo i\n"
                + "WHERE ci.id_insumo = i.id_insumo AND CAST (ci.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";

        return listaCompraInsumos;
    }
}
