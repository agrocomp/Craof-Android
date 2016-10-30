package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.entidade.craof.LocalPlantio;
import org.entidade.craof.Plantio;
import util.Conexao;

public class PlantioDAO {

    public Date converterData(String data) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = df.parse(data);
        System.out.println("dataF: " + dataFormatada);
        return dataFormatada;
    }

    public boolean salvar(Plantio plantio) throws SQLException {
        String sql = "INSERT INTO controle_plantio(data, quantidade, id_cultura, id_local_plantio, id_usuario) VALUES (?,?,?,?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, plantio.getData());
        ps.setObject(2, plantio.getQuantidade());
        ps.setObject(3, plantio.getCultura().getCodigo());
        ps.setObject(4, plantio.getLocalPlantio().getId_localPlantio());
        ps.setObject(5, plantio.getId_usuario());
        boolean salvou = ps.execute();
        Conexao.setConnection();
        return salvou;
    }

    public ArrayList<Plantio> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<Plantio> listaPlantio = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        System.out.println("di: " +dataInicial);
        System.out.println("df: " +dataFinal);
        String sql = "SELECT cp.id_controle_plantio, cp.data, cp.quantidade, c.nome, lp.descricao FROM controle_plantio cp, cultura c, local_plantio lp \n"
                + "WHERE cp.id_cultura = c.id_cultura AND cp.id_local_plantio = lp.id_local_plantio AND CAST (cp.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("here");
            Plantio aux = new Plantio();
            aux.setId_plantio(rs.getInt("id_controle_plantio"));
            aux.setData(rs.getString("data"));
            aux.setQuantidade(rs.getInt("quantidade"));
            aux.getCultura().setNome(rs.getString("nome"));
            aux.getLocalPlantio().setDescricao(rs.getString("descricao"));
            listaPlantio.add(aux);
        }
        Conexao.setConnection();
        return listaPlantio;
    }
    
    public ArrayList<Plantio> obterTodosRelatorio() throws ParseException, SQLException {
        ArrayList<Plantio> listaPlantio = new ArrayList();
        String sql = "SELECT cp.id_controle_plantio, cp.data, cp.quantidade, c.nome, lp.descricao FROM controle_plantio cp, cultura c, local_plantio lp \n"
                + "WHERE cp.id_cultura = c.id_cultura AND cp.id_local_plantio = lp.id_local_plantio";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("here");
            Plantio aux = new Plantio();
            aux.setId_plantio(rs.getInt("id_controle_plantio"));
            aux.setData(rs.getString("data"));
            aux.setQuantidade(rs.getInt("quantidade"));
            aux.getCultura().setNome(rs.getString("nome"));
            aux.getLocalPlantio().setDescricao(rs.getString("descricao"));
            listaPlantio.add(aux);
        }
        Conexao.setConnection();
        return listaPlantio;
    }
    
    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_controle_plantio) FROM controle_plantio";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
