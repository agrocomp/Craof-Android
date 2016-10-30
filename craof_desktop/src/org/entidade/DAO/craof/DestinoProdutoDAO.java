package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.entidade.craof.AplicacaoInsumo;
import org.entidade.craof.DestinoProduto;
import util.Conexao;

public class DestinoProdutoDAO {

    public boolean salvar(DestinoProduto destinoProduto) throws SQLException {
        String sql = "INSERT INTO destino_produto (data, quantidade, id_cultura, id_local_plantio, id_local_destino, id_usuario) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, destinoProduto.getDataColheita());
        ps.setObject(2, destinoProduto.getQuantidade());
        ps.setObject(3, destinoProduto.getCultura().getCodigo());
        ps.setObject(4, destinoProduto.getLocalPlantio().getId_localPlantio());
        ps.setObject(5, destinoProduto.getLocalDestino().getId_localDestino());
        ps.setObject(6, destinoProduto.getId_usuario());
        boolean cadastrou = ps.execute();
        Conexao.setConnection();
        return cadastrou;
    }

    public ArrayList<DestinoProduto> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<DestinoProduto> listaDestinoProduto = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        String sql = "SELECT dp.id_destino_produto, dp.data, c.nome, lp.descricao, ld.descricao, dp.quantidade FROM destino_produto dp, cultura c, local_plantio lp, local_destino ld\n"
                + "WHERE dp.id_cultura = c.id_cultura AND dp.id_local_plantio = lp.id_local_plantio AND dp.id_local_destino = ld.id_local_destino AND CAST (dp.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DestinoProduto aux = new DestinoProduto();
            aux.setId_destinoProduto(rs.getInt(1));
            aux.setDataColheita(rs.getString(2));
            aux.getCultura().setNome(rs.getString(3));
            aux.getLocalPlantio().setDescricao(rs.getString(4));
            aux.getLocalDestino().setDescricao(rs.getString(5));
            aux.setQuantidade(rs.getInt(6));
            listaDestinoProduto.add(aux);
        }
        Conexao.setConnection();
        return listaDestinoProduto;
    }

    public ArrayList<DestinoProduto> obterTodosRelatorio() throws ParseException, SQLException {
        ArrayList<DestinoProduto> listaDestinoProduto = new ArrayList();
        String sql = "SELECT dp.id_destino_produto, dp.data, c.nome, lp.descricao, ld.descricao, dp.quantidade FROM destino_produto dp, cultura c, local_plantio lp, local_destino ld\n"
                + "WHERE dp.id_cultura = c.id_cultura AND dp.id_local_plantio = lp.id_local_plantio AND dp.id_local_destino = ld.id_local_destino";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DestinoProduto aux = new DestinoProduto();
            aux.setId_destinoProduto(rs.getInt(1));
            aux.setDataColheita(rs.getString(2));
            aux.getCultura().setNome(rs.getString(3));
            aux.getLocalPlantio().setDescricao(rs.getString(4));
            aux.getLocalDestino().setDescricao(rs.getString(5));
            aux.setQuantidade(rs.getInt(6));
            listaDestinoProduto.add(aux);
        }
        Conexao.setConnection();
        return listaDestinoProduto;
    }

    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_destino_produto) FROM destino_produto";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
