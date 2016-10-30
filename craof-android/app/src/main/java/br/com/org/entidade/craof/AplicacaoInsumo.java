package br.com.org.entidade.craof;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Date;

public class AplicacaoInsumo implements Serializable {

    private Integer id_aplicaoInsumo;
    private String dataAplicacao;
    private Cultura cultura;
    private String finalidade;
    private Insumo insumo;
    private String quantidade;
    private Integer id_usuario;

    public AplicacaoInsumo() {
        cultura = new Cultura();
        insumo = new Insumo();
    }

    
    
    public Integer getId_aplicaoInsumo() {
        return id_aplicaoInsumo;
    }

    public void setId_aplicaoInsumo(Integer id_aplicaoInsumo) {
        this.id_aplicaoInsumo = id_aplicaoInsumo;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Cultura getCultura() {
        return cultura;
    }

    public void setCultura(Cultura cultura) {
        this.cultura = cultura;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}
