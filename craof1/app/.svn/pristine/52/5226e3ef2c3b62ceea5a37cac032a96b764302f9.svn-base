package br.com.org.controle.craof;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import br.com.org.entidade.DAO.craof.PlantioDAO;
import br.com.org.entidade.craof.Plantio;


public class Controle_plantio {

    PlantioDAO plantioDAO = new PlantioDAO();

    public boolean salvar(Plantio plantio) throws SQLException {
        return plantioDAO.salvar(plantio);
    }

    public ArrayList<Plantio> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        return plantioDAO.obterRelatorio(dataInicial, dataFinal);
    }
}
