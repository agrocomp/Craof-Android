package br.com.org.entidade.craof;

import java.io.Serializable;
import java.util.ArrayList;

public class Insumo implements Serializable {

    private Integer id_insumo;
    private String descricao;
    private Boolean flagProducao;
    private Integer id_usuario;
    private ArrayList<Insumo> listaInsumo = new ArrayList();

    public Integer getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(Integer id_insumo) {
        this.id_insumo = id_insumo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getFlagProducao() {
        return flagProducao;
    }

    public void setFlagProducao(Boolean flagProducao) {
        this.flagProducao = flagProducao;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public ArrayList<Insumo> getListaInsumo() {
        return listaInsumo;
    }

    public void setListaInsumo(ArrayList<Insumo> listaInsumo) {
        this.listaInsumo = listaInsumo;
    }

}
