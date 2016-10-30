package br.com.org.entidade.craof;

import java.util.Date;

public class ProducaoInsumo {

        private Integer id_producaoInsumo;
	private String data;
        private Insumo insumo;
	private float quantidade;
        private Integer id_usuario;

    public ProducaoInsumo() {
        insumo = new Insumo();
    }

    public Integer getId_producaoInsumo() {
        return id_producaoInsumo;
    }

    public void setId_producaoInsumo(Integer id_producaoInsumo) {
        this.id_producaoInsumo = id_producaoInsumo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
        
        

}
