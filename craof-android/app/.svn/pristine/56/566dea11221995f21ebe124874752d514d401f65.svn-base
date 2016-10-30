package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.org.entidade.craof.AplicacaoInsumo;


public class AplicacaoInsumoDAO {

    public boolean salvar(AplicacaoInsumo aplicacaoInsumo) throws SQLException {
        String sql = "INSERT INTO aplicacao_insumo (data, id_insumo, quantidade, id_cultura, id_local_plantio, id_usuario) VALUES (?,?,?,?,?,?)";

        boolean cadastrou = false;

        return cadastrou;
    }

    public ArrayList<AplicacaoInsumo> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<AplicacaoInsumo> listaAplicacaoInsumo = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        String sql = "SELECT ai.id_aplicacao_insumo, ai.data, i.descricao, ai.quantidade, c.nome, lp.descricao FROM aplicacao_insumo ai, insumo i, cultura c, local_plantio lp\n"
                + "WHERE ai.id_insumo = i.id_insumo AND ai.id_local_plantio = lp.id_local_plantio AND ai.id_insumo = i.id_insumo AND ai.id_cultura = c.id_cultura AND CAST (ai.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";

        return listaAplicacaoInsumo;
    }
}
