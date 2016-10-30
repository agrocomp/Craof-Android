package org.entidade.craof;

import java.util.Date;

public class AplicacaoInsumo {

    private Integer id_aplicaoInsumo;
    private String dataAplicacao;
    private Cultura cultura;
    private LocalPlantio localPlantio;
    private Insumo insumo;
    private Integer quantidade;
    private Integer id_usuario;
    private String finalidade;

    public AplicacaoInsumo() {
        cultura = new Cultura();
        localPlantio = new LocalPlantio();
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

    public LocalPlantio getLocalPlantio() {
        return localPlantio;
    }

    public void setLocalPlantio(LocalPlantio localPlantio) {
        this.localPlantio = localPlantio;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }
}
