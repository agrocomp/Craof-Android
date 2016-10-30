package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.org.entidade.craof.Plantio;


public class PlantioDAO {

    public Date converterData(String data) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = df.parse(data);
        System.out.println("dataF: " + dataFormatada);
        return dataFormatada;
    }

    public boolean salvar(Plantio plantio) throws SQLException {
        String sql = "INSERT INTO controle_plantio(data, quantidade, id_cultura, id_local_plantio, id_usuario) VALUES (?,?,?,?,?)";

        return false;
    }

    public ArrayList<Plantio> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<Plantio> listaPlantio = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        System.out.println("di: " +dataInicial);
        System.out.println("df: " +dataFinal);
        String sql = "SELECT cp.id_controle_plantio, cp.data, cp.quantidade, c.nome, lp.descricao FROM controle_plantio cp, cultura c, local_plantio lp \n"
                + "WHERE cp.id_cultura = c.id_cultura AND cp.id_local_plantio = lp.id_local_plantio AND CAST (cp.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";

        return listaPlantio;
    }
}
