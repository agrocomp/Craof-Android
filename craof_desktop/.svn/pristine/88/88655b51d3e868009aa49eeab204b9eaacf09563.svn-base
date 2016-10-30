package org.controle.craof;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import org.entidade.DAO.craof.DestinoProdutoDAO;
import org.entidade.craof.DestinoProduto;

public class Controle_Destino_Produtos {

    DestinoProdutoDAO destinoProdutoDAO = new DestinoProdutoDAO();

    public boolean salvar(DestinoProduto destinoProduto) throws SQLException {
        return destinoProdutoDAO.salvar(destinoProduto);
    }

    public ArrayList<DestinoProduto> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        return destinoProdutoDAO.obterRelatorio(dataInicial, dataFinal);
    }

    public ArrayList<DestinoProduto> obterTodosRelatorio() throws ParseException, SQLException {
        return destinoProdutoDAO.obterTodosRelatorio();
    }

    public String maximoId() throws SQLException {
        return destinoProdutoDAO.maximoId() + "";
    }
}
