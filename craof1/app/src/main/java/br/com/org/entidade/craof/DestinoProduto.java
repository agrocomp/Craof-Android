package br.com.org.entidade.craof;

import java.util.Date;

public class DestinoProduto {

    private Integer id_destinoProduto;
    private String dataColheita;
    private Cultura cultura;
    private float quantidade;
    private LocalPlantio localPlantio;
    private LocalDestino localDestino;
    private Integer id_usuario;

    public DestinoProduto() {
        cultura = new Cultura();
        localPlantio = new LocalPlantio();
        localDestino = new LocalDestino();
    }

    public Integer getId_destinoProduto() {
        return id_destinoProduto;
    }

    public void setId_destinoProduto(Integer id_destinoProduto) {
        this.id_destinoProduto = id_destinoProduto;
    }

    public String getDataColheita() {
        return dataColheita;
    }

    public void setDataColheita(String dataColheita) {
        this.dataColheita = dataColheita;
    }


    public Cultura getCultura() {
        return cultura;
    }

    public void setCultura(Cultura cultura) {
        this.cultura = cultura;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public LocalPlantio getLocalPlantio() {
        return localPlantio;
    }

    public void setLocalPlantio(LocalPlantio localPlantio) {
        this.localPlantio = localPlantio;
    }

    public LocalDestino getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(LocalDestino localDestino) {
        this.localDestino = localDestino;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

}
