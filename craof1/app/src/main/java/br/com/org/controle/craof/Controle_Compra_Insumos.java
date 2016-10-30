package br.com.org.controle.craof;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import br.com.org.entidade.DAO.craof.CompraInsumosDAO;
import br.com.org.entidade.craof.CompraInsumos;


public class Controle_Compra_Insumos {

    CompraInsumosDAO compraInsumosDAO = new CompraInsumosDAO();
    
    public boolean salvar(CompraInsumos compraInsumos) throws SQLException{
        return compraInsumosDAO.salvar(compraInsumos);
    }
    
    public ArrayList<CompraInsumos> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException{
        return compraInsumosDAO.obterRelatorio(dataInicial, dataFinal);
    }
    
    public int buscarId(String descricao) throws SQLException{
        return compraInsumosDAO.buscarId(descricao); 
    }
}
