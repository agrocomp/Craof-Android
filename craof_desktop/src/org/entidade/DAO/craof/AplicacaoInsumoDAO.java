package org.entidade.DAO.craof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.entidade.craof.AplicacaoInsumo;
import util.Conexao;

public class AplicacaoInsumoDAO {

    public boolean salvar(AplicacaoInsumo aplicacaoInsumo) throws SQLException {
        String sql = "INSERT INTO aplicacao_insumo (data, id_insumo, quantidade, id_cultura, finalidade, id_usuario) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ps.setObject(1, aplicacaoInsumo.getDataAplicacao());
        ps.setObject(2, aplicacaoInsumo.getInsumo().getId_insumo());
        ps.setObject(3, aplicacaoInsumo.getQuantidade());
        ps.setObject(4, aplicacaoInsumo.getCultura().getCodigo());
        ps.setObject(5, aplicacaoInsumo.getFinalidade());
        ps.setObject(6, aplicacaoInsumo.getId_usuario());
        boolean cadastrou = ps.execute();
        Conexao.setConnection();
        return cadastrou;
    }

    public ArrayList<AplicacaoInsumo> obterRelatorio(String dataInicial, String dataFinal) throws ParseException, SQLException {
        ArrayList<AplicacaoInsumo> listaAplicacaoInsumo = new ArrayList();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date di = df.parse(dataInicial);
        Date da = df.parse(dataFinal);
        df = new SimpleDateFormat("dd/mm/yyyy");
        dataInicial = df.format(di);
        dataFinal = df.format(da);
        String sql = "SELECT ai.id_aplicacao_insumo, ai.data, i.descricao, ai.quantidade, c.nome, ai.finalidade FROM aplicacao_insumo ai, insumo i, cultura c, local_plantio lp\n"
                + "WHERE ai.id_insumo = i.id_insumo AND ai.id_cultura = c.id_cultura AND CAST (ai.data as date) between '" + dataInicial + "' AND '" + dataFinal + "'";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            AplicacaoInsumo aux = new AplicacaoInsumo();
            aux.setId_aplicaoInsumo(rs.getInt("id_aplicacao_insumo"));
            aux.setDataAplicacao(rs.getString("data"));
            aux.getInsumo().setDescricao(rs.getString(3));
            aux.setQuantidade(rs.getInt("quantidade"));
            aux.getCultura().setNome(rs.getString("nome"));
            aux.getLocalPlantio().setDescricao(rs.getString(6));
            listaAplicacaoInsumo.add(aux);
        }
        Conexao.setConnection();
        return listaAplicacaoInsumo;
    }

    public ArrayList<AplicacaoInsumo> obterTodosRelatorio() throws ParseException, SQLException {
        ArrayList<AplicacaoInsumo> listaAplicacaoInsumo = new ArrayList();
        String sql = "SELECT ai.id_aplicacao_insumo, ai.data, i.descricao, ai.quantidade, c.nome, finalidade\n"
                + "FROM aplicacao_insumo as ai \n"
                + "INNER JOIN insumo i on ai.id_insumo = i.id_insumo \n"
                + "INNER JOIN cultura as c on ai.id_cultura = c.id_cultura";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            AplicacaoInsumo aux = new AplicacaoInsumo();
            aux.setId_aplicaoInsumo(rs.getInt("id_aplicacao_insumo"));
            aux.setDataAplicacao(rs.getString("data"));
            aux.getInsumo().setDescricao(rs.getString(3));
            aux.setQuantidade(rs.getInt("quantidade"));
            aux.getCultura().setNome(rs.getString("nome"));
            aux.setFinalidade(rs.getString("finalidade"));
            listaAplicacaoInsumo.add(aux);
        }
        Conexao.setConnection();
        return listaAplicacaoInsumo;
    }

    public int maximoId() throws SQLException {
        int max = 0;
        String sql = "SELECT max(id_aplicacao_insumo) FROM aplicacao_insumo";
        PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt(1) + 1;
        }
        Conexao.setConnection();
        return max;
    }
}
