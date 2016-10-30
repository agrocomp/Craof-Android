package br.com.screen.craof.aplicacaoInsumo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;
import br.com.org.entidade.craof.Insumo;

/**
 * Created by Luan on 30/10/2016.
 */
public class AplicacaoInsumoQuantidade extends Activity {
    Button btAplicacaoInsumoQuantidadeProximo;
    Button btAplicacaoInsumoQuantidadeVoltar;
    Button btAplicacaoInsumoQuantidadeCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacaoinsumo_quantidade);



        btAplicacaoInsumoQuantidadeCancelar = (Button) findViewById(R.id.btAplicacaoInsumoQuantidadeCancelar);
        btAplicacaoInsumoQuantidadeCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoQuantidade.this, AplicacaoInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoQuantidadeVoltar = (Button) findViewById(R.id.btAplicacaoInsumoQuantidadeVoltar);
        btAplicacaoInsumoQuantidadeVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoQuantidade.this, AplicacaoInsumoInsumo.class);
                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoQuantidadeProximo = (Button) findViewById(R.id.btAplicacaoInsumoQuantidadeProximo);
        btAplicacaoInsumoQuantidadeProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoQuantidade.this, AplicacaoInsumoCultura.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
