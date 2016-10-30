package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.entidade.craof.CompraInsumos;
import util.Conexao;

public class CompraInsumosDAO {

    public boolean salvar(CompraInsumos compraInsumos) throws SQLException {
        String sql = "INSERT INTO compra_insumos (data, id_insumo, quantidade, finalidade, id_usuario) VALUES (?,?,?,?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, compraInsumos.getDataCompra());
        ps.setObject(2, compraInsumos.getInsumo().getId_insumo());
        ps.setObject(3, compraInsumos.getQuantidade());
        ps.setObject(4, compraInsumos.getFinalidade());
        ps.setObject(5, compraInsumos.getId_usuario());
        boolean cadastrou = ps.execute();
        Conexao.setConnection();
        return cadastrou;
    }

    public int buscarId(String descricao) throws SQLException {
        int max = 0;
        String sql = "SELECT * FROM insumo WHERE descricao = '" + descricao + "'";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt("id_insumo");
        }
        Conexao.setConnection();
        return max;
    }

    public ArrayList<CompraInsumos> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<CompraInsumos> listaCompraInsumos = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        System.out.println("di: " + dataInicial);
        System.out.println("df: " + dataFinal);
        String sql = "SELECT ci.id_compra_insumo, ci.data, i.descricao, ci.quantidade, ci.finalidade FROM compra_insumos ci, insumo i\n"
                + "WHERE ci.id_insumo = i.id_insumo AND CAST (ci.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            CompraInsumos aux = new CompraInsumos();
            aux.setId_compraInsumo(rs.getInt("id_compra_insumo"));
            aux.setDataCompra(rs.getString("data"));
            aux.getInsumo().setDescricao(rs.getString("descricao"));
            aux.setQuantidade(rs.getInt("quantidade"));
            aux.setFinalidade(rs.getString("finalidade"));
            listaCompraInsumos.add(aux);
        }
        Conexao.setConnection();
        return listaCompraInsumos;
    }
    
    public ArrayList<CompraInsumos> obterTodosRelatorio() throws ParseException, SQLException {
        ArrayList<CompraInsumos> listaCompraInsumos = new ArrayList();
        /*DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        System.out.println("di: " + dataInicial);
        System.out.println("df: " + dataFinal);
        */String sql = "SELECT ci.id_compra_insumo, ci.data, i.descricao, ci.quantidade, ci.finalidade FROM compra_insumos ci, insumo i\n"
                + "WHERE ci.id_insumo = i.id_insumo";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            CompraInsumos aux = new CompraInsumos();
            aux.setId_compraInsumo(rs.getInt("id_compra_insumo"));
            aux.setDataCompra(rs.getString("data"));
            aux.getInsumo().setDescricao(rs.getString("descricao"));
            aux.setQuantidade(rs.getInt("quantidade"));
            aux.setFinalidade(rs.getString("finalidade"));
            listaCompraInsumos.add(aux);
        }
        Conexao.setConnection();
        return listaCompraInsumos;
    }
    
    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_compra_insumo) FROM compra_insumos";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
