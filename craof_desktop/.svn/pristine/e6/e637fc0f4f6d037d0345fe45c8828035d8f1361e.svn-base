package org.controle.craof;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import org.entidade.DAO.craof.ProducaoInsumoDAO;
import org.entidade.craof.ProducaoInsumo;

public class Controle_Insumos_Produzidos {

    public boolean salvar(ProducaoInsumo producao) throws SQLException {
        return ProducaoInsumoDAO.salvar(producao);
    }

    public ArrayList<ProducaoInsumo> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        return ProducaoInsumoDAO.obterRelatorio(dataInicial, dataFinal);
    }

    public ArrayList<ProducaoInsumo> obterTodosRelatorio() throws ParseException, SQLException {
        return ProducaoInsumoDAO.obterTodosRelatorio();
    }

    public String maximoId() throws SQLException {
        return ProducaoInsumoDAO.maximoId() + "";
    }
}
