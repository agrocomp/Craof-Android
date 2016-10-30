package org.controle.craof;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import org.entidade.DAO.craof.AplicacaoInsumoDAO;
import org.entidade.craof.AplicacaoInsumo;

public class Controle_aplicacao {

    AplicacaoInsumoDAO aplicacaoInsumoDAO = new AplicacaoInsumoDAO();

    public boolean salvar(AplicacaoInsumo aplicacaoInsumo) throws SQLException {
        return aplicacaoInsumoDAO.salvar(aplicacaoInsumo);
    }
    
    public ArrayList<AplicacaoInsumo> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException{
        return aplicacaoInsumoDAO.obterRelatorio(dataInicial, dataFinal);
    }
    
    public ArrayList<AplicacaoInsumo> obterTodosRelatorio() throws ParseException, SQLException{
        return aplicacaoInsumoDAO.obterTodosRelatorio();
    }
    
    public String maximoId() throws SQLException{
        return aplicacaoInsumoDAO.maximoId() + "";
    }
}
