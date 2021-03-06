package br.com.screen.craof.aplicacaoInsumo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;
import br.com.org.entidade.craof.Cultura;

/**
 * Created by Luan on 30/10/2016.
 */
public class AplicacaoInsumoCultura extends Activity {
    Button btAplicacaoInsumoCulturaProximo;
    Button btAplicacaoInsumoCulturaVoltar;
    Button btAplicacaoInsumoCulturaCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacaoinsumo_cultura);


        btAplicacaoInsumoCulturaCancelar = (Button) findViewById(R.id.btAplicacaoInsumoCulturaCancelar);
        btAplicacaoInsumoCulturaCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoCultura.this, AplicacaoInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoCulturaVoltar = (Button) findViewById(R.id.btAplicacaoInsumoCulturaVoltar);
        btAplicacaoInsumoCulturaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoCultura.this, AplicacaoInsumoQuantidade.class);
                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoCulturaProximo = (Button) findViewById(R.id.btAplicacaoInsumoCulturaProximo);
        btAplicacaoInsumoCulturaProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoCultura.this, AplicacaoInsumoFinalidade.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
