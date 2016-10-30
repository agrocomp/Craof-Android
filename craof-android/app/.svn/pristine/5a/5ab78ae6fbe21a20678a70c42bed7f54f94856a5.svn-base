package br.com.screen.craof.compraInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;
import br.com.org.entidade.craof.CompraInsumos;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoInsumo;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoPrincipal;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class CompraInsumoData extends Activity {
    Button btCompraInsumoDataCancelar, btCompraInsumoDataProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprainsumo_data);

        btCompraInsumoDataCancelar = (Button) findViewById(R.id.btCompraInsumoDataCancelar);
       btCompraInsumoDataCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CompraInsumoData.this, CompraInsumoPrincipal.class));
            }
        });
        btCompraInsumoDataProximo = (Button) findViewById(R.id.btCompraInsumoDataProximo);
        btCompraInsumoDataProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoData.this, CompraInsumoInsumo.class);
                startActivity(intent);


            }
        });


    }
}
