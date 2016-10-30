package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.org.entidade.craof.DestinoProduto;


public class DestinoProdutoDAO {

    public boolean salvar(DestinoProduto destinoProduto) throws SQLException {
        String sql = "INSERT INTO destino_produto (data, quantidade, id_cultura, id_local_plantio, id_local_destino, id_usuario) VALUES (?,?,?,?,?,?)";

        boolean cadastrou = false;

        return cadastrou;
    }

    public ArrayList<DestinoProduto> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<DestinoProduto> listaDestinoProduto = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        String sql = "SELECT dp.id_destino_produto, dp.data, c.nome, lp.descricao, ld.descricao, dp.quantidade FROM destino_produto dp, cultura c, local_plantio lp, local_destino ld\n"
                + "WHERE dp.id_cultura = c.id_cultura AND dp.id_local_plantio = lp.id_local_plantio AND dp.id_local_destino = ld.id_local_destino AND CAST (dp.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";

        return listaDestinoProduto;
    }
}
