package br.com.screen.craof.aplicacaoInsumo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import br.com.R;
import br.com.org.ItemListView;
import br.com.org.entidade.craof.AplicacaoInsumo;

/**
 * Created by Luan on 30/10/2016.
 */
public class AplicacaoInsumoData extends Activity{

    Button btAplicacaoInsumoDataProximo;
    Button btAplicacaoInsumoDataCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacaoinsumo_data);

        btAplicacaoInsumoDataCancelar = (Button) findViewById(R.id.btAplicacaoInsumoDataCancelar);
        btAplicacaoInsumoDataCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AplicacaoInsumoData.this, AplicacaoInsumoPrincipal.class));
            }
        });
        btAplicacaoInsumoDataProximo = (Button) findViewById(R.id.btAplicacaoInsumoDataProximo);
        btAplicacaoInsumoDataProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoData.this, AplicacaoInsumoInsumo.class);
                startActivity(intent);


            }
        });


    }
}
