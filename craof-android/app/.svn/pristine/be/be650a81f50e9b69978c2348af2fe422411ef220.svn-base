package br.com.org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.org.entidade.craof.Insumo;
import br.com.org.entidade.craof.ProducaoInsumo;

public class ProducaoInsumoDAO {

    public static boolean salvar(ProducaoInsumo producao) throws SQLException {
        String sql = "INSERT INTO producao_insumo (data, quantidade, id_insumo, id_usuario) VALUES (?,?,?,?)";
        return false;
    }

    public static ArrayList<ProducaoInsumo> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<ProducaoInsumo> listaProducaoInsumo = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        String sql = "SELECT pi.id_producao_insumo, pi.data, i.descricao, pi.quantidade, pi.id_insumo FROM producao_insumo pi, insumo i\n"
                + "WHERE pi.id_insumo = i.id_insumo AND CAST (pi.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";

        return listaProducaoInsumo;
    }
    
    public static ArrayList<Insumo> buscarItensInsumo(int id) throws SQLException{
        ArrayList<Insumo> listaInsumo = new ArrayList();
        String sql = "SELECT ing.id_ingrediente, ins.descricao FROM ingrediente ing, insumo ins WHERE ing.id_ingrediente = ins.id_insumo AND ing.id_insumo = " + id;

        return listaInsumo;
    }
}
