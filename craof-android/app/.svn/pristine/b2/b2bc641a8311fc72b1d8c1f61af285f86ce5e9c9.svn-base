package br.com.screen.craof.aplicacaoInsumo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;

/**
 * Created by Luan on 30/10/2016.
 */
public class AplicacaoInsumoFinalidade extends Activity{
    Button btAplicacaoInsumoFinalidadeProximo;
    Button btAplicacaoInsumoFinalidadeVoltar;
    Button btAplicacaoInsumoFinalidadeCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacaoinsumo_finalidade);



        btAplicacaoInsumoFinalidadeCancelar = (Button) findViewById(R.id.btAplicacaoInsumoFinalidadeCancelar);
        btAplicacaoInsumoFinalidadeCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoFinalidade.this, AplicacaoInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoFinalidadeVoltar = (Button) findViewById(R.id.btAplicacaoInsumoFinalidadeVoltar);
        btAplicacaoInsumoFinalidadeVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoFinalidade.this, AplicacaoInsumoCultura.class);

                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoFinalidadeProximo = (Button) findViewById(R.id.btAplicacaoInsumoFinalidadeProximo);
        btAplicacaoInsumoFinalidadeProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoFinalidade.this, AplicacaoInsumoVisualizar.class);

                startActivity(intent);
                finish();
            }
        });
    }

}
