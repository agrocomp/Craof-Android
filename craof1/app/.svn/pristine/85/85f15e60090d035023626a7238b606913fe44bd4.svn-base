package br.com.screen.craof.compraInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoCultura;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoPrincipal;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoVisualizar;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class CompraInsumoFinalidade extends Activity {
    Button btCompraInsumoFinalidadeCancelar, btCompraInsumoFinalidadeProximo, btCompraInsumoFinalidadeVoltar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprainsumo_finalidade);



        btCompraInsumoFinalidadeCancelar = (Button) findViewById(R.id.btCompraInsumoFinalidadeCancelar);
        btCompraInsumoFinalidadeCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoFinalidade.this, CompraInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoFinalidadeVoltar = (Button) findViewById(R.id.btCompraInsumoFinalidadeVoltar);
        btCompraInsumoFinalidadeVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoFinalidade.this, CompraInsumoQuantidade.class);
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoFinalidadeProximo = (Button) findViewById(R.id.btCompraInsumoFinalidadeProximo);
        btCompraInsumoFinalidadeProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoFinalidade.this, CompraInsumoVisualizar.class);
                startActivity(intent);
                finish();
            }
        });
    }

}

