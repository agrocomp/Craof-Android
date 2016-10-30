package br.com.org.controle.craof;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import br.com.org.entidade.DAO.craof.ProducaoInsumoDAO;
import br.com.org.entidade.craof.ProducaoInsumo;


public class Controle_Insumos_Produzidos {

    public boolean salvar(ProducaoInsumo producao) throws SQLException {
        return ProducaoInsumoDAO.salvar(producao);
    }

    public ArrayList<ProducaoInsumo> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        return ProducaoInsumoDAO.obterRelatorio(dataInicial, dataFinal);
    }
}
