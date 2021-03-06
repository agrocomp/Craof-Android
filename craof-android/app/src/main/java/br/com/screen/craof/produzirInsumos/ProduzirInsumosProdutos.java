package br.com.screen.craof.produzirInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.R;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class ProduzirInsumosProdutos extends Activity {

    Button btProduzirInsumoProdutosVoltar;
    Button btProduzirInsumoProdutosProximo;
    Button btProduzirInsumoProdutosCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produzirinsumo_produtos);
/*
        final AplicacaoInsumo aplicacaoInsumo = (AplicacaoInsumo) getIntent().getSerializableExtra("intent");
        if (aplicacaoInsumo != null)
            ((EditText) findViewById(R.id.etAplicacaoInsumoQuantidade)).setText(aplicacaoInsumo.getQuantidade());*/
        btProduzirInsumoProdutosCancelar = (Button) findViewById(R.id.btProduzirInsumoProdutosCancelar);
        btProduzirInsumoProdutosCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProduzirInsumosProdutos.this, ProduzirInsumosPrincipal.class));
            }
        });
        btProduzirInsumoProdutosVoltar = (Button) findViewById(R.id.btProduzirInsumoProdutosVoltar);
        btProduzirInsumoProdutosVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosProdutos.this, ProduzirInsumosInsumo.class);
                startActivity(intent);
                finish();
            }
        });

        btProduzirInsumoProdutosProximo = (Button) findViewById(R.id.btProduzirInsumoProdutosProximo);
        btProduzirInsumoProdutosProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosProdutos.this, ProduzirInsumosQuantidade.class);
              /*  AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                aplicacaoInsumo1.setFinalidade(((EditText) findViewById(R.id.etAplicacaoInsumoCultura)).getText().toString());
                intent.putExtra("insumo", aplicacaoInsumo1);*/
                startActivity(intent);
                finish();
            }
        });



}
}