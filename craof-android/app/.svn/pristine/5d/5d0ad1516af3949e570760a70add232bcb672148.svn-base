package br.com.screen.craof.compraInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoFinalidade;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoPrincipal;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class CompraInsumoVisualizar extends Activity {

    Button btCompraInsumoVisualizarCancelar, btCompraInsumoVisualizarVoltar, btCompraInsumoVisualizarSalvar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprainsumo_visualizar);

        /*final AplicacaoInsumo aplicacaoInsumo = (AplicacaoInsumo) getIntent().getSerializableExtra("intent");
        if (aplicacaoInsumo != null){
            ((TextView) findViewById(R.id.tvAplicacaoData)).setText(aplicacaoInsumo.getDataAplicacao());
            ((TextView) findViewById(R.id.tvAplicacaoQuantidade)).setText(aplicacaoInsumo.getQuantidade());
            ((TextView) findViewById(R.id.tvAplicacaoInsumo)).setText(aplicacaoInsumo.getQuantidade());
            ((TextView) findViewById(R.id.tvAplicacaoCultura)).setText(aplicacaoInsumo.getCultura().getNome());
            ((TextView) findViewById(R.id.tvAplicacaoFinalidade)).setText(aplicacaoInsumo.getFinalidade());

        }*/


        btCompraInsumoVisualizarCancelar = (Button) findViewById(R.id.btCompraInsumoVisualizarCancelar);
        btCompraInsumoVisualizarCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoVisualizar.this, CompraInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoVisualizarVoltar = (Button) findViewById(R.id.btCompraInsumoVisualizarVoltar);
        btCompraInsumoVisualizarVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoVisualizar.this, CompraInsumoFinalidade.class);
                /*AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                aplicacaoInsumo1.setFinalidade(((EditText) findViewById(R.id.etAplicacaoInsumoCultura)).getText().toString());
                intent.putExtra("insumo", aplicacaoInsumo1);*/
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoVisualizarSalvar = (Button) findViewById(R.id.btCompraInsumoVisualizarSalvar);
        btCompraInsumoVisualizarSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoVisualizar.this, CompraInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
