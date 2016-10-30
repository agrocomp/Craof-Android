package br.com.screen.craof.compraInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;
import br.com.org.entidade.craof.Insumo;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoData;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoPrincipal;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoQuantidade;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class CompraInsumoInsumo extends Activity {
    Button btCompraInsumoInsumoVoltar, btCompraInsumoInsumoProximo, btCompraInsumoInsumoCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprainsumo_insumo);


        btCompraInsumoInsumoCancelar = (Button) findViewById(R.id.btCompraInsumoInsumoCancelar);
        btCompraInsumoInsumoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoInsumo.this, CompraInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoInsumoVoltar = (Button) findViewById(R.id.btCompraInsumoInsumoVoltar);
        btCompraInsumoInsumoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoInsumo.this, CompraInsumoData.class);
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoInsumoProximo = (Button) findViewById(R.id.btCompraInsumoInsumoProximo);
        btCompraInsumoInsumoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoInsumo.this, CompraInsumoQuantidade.class);

                startActivity(intent);
                finish();
            }
        });
    }
}
