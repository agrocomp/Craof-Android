package br.com.screen.craof.produzirInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.R;
import br.com.screen.craof.compraInsumos.CompraInsumoFinalidade;
import br.com.screen.craof.compraInsumos.CompraInsumoPrincipal;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class ProduzirInsumosVisualizar extends Activity {

    Button btProduzirInsumoVisualizarCancelar, btProduzirInsumoVisualizarVoltar, btProduzirInsumoVisualizarSalvar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produzirinsumo_visualizar);

        /*final AplicacaoInsumo aplicacaoInsumo = (AplicacaoInsumo) getIntent().getSerializableExtra("intent");
        if (aplicacaoInsumo != null){
            ((TextView) findViewById(R.id.tvAplicacaoData)).setText(aplicacaoInsumo.getDataAplicacao());
            ((TextView) findViewById(R.id.tvAplicacaoQuantidade)).setText(aplicacaoInsumo.getQuantidade());
            ((TextView) findViewById(R.id.tvAplicacaoInsumo)).setText(aplicacaoInsumo.getQuantidade());
            ((TextView) findViewById(R.id.tvAplicacaoCultura)).setText(aplicacaoInsumo.getCultura().getNome());
            ((TextView) findViewById(R.id.tvAplicacaoFinalidade)).setText(aplicacaoInsumo.getFinalidade());

        }*/


        btProduzirInsumoVisualizarCancelar = (Button) findViewById(R.id.btProduzirInsumoVisualizarCancelar);
        btProduzirInsumoVisualizarCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosVisualizar.this, ProduzirInsumosPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btProduzirInsumoVisualizarVoltar = (Button) findViewById(R.id.btProduzirInsumoVisualizarVoltar);
        btProduzirInsumoVisualizarVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosVisualizar.this, ProduzirInsumosQuantidade.class);
                /*AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                aplicacaoInsumo1.setFinalidade(((EditText) findViewById(R.id.etAplicacaoInsumoCultura)).getText().toString());
                intent.putExtra("insumo", aplicacaoInsumo1);*/
                startActivity(intent);
                finish();
            }
        });

        btProduzirInsumoVisualizarSalvar = (Button) findViewById(R.id.btProduzirInsumoVisualizarSalvar);
        btProduzirInsumoVisualizarSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosVisualizar.this, ProduzirInsumosPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
