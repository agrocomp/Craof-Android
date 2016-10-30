package org.controle.craof;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import org.entidade.DAO.craof.PlantioDAO;
import org.entidade.craof.Plantio;

public class Controle_plantio {

    PlantioDAO plantioDAO = new PlantioDAO();

    public boolean salvar(Plantio plantio) throws SQLException {
        return plantioDAO.salvar(plantio);
    }

    public ArrayList<Plantio> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        return plantioDAO.obterRelatorio(dataInicial, dataFinal);
    }
    
    public String maximoId() throws SQLException{
        return plantioDAO.maximoId() + "";
    }
    
    public ArrayList<Plantio> obterTodosRelatorio() throws ParseException, SQLException {
        return plantioDAO.obterTodosRelatorio();
    }
}
