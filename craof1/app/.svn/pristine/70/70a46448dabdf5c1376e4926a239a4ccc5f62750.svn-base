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
public class AplicacaoInsumoInsumo extends Activity{
    Button btAplicacaoInsumoInsumoVoltar;
    Button btAplicacaoInsumoInsumoCancelar;
    Button btAplicacaoInsumoInsumoProximo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacaoinsumo_insumo);


        btAplicacaoInsumoInsumoCancelar = (Button) findViewById(R.id.btAplicacaoInsumoInsumoCancelar);
        btAplicacaoInsumoInsumoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoInsumo.this, AplicacaoInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoInsumoVoltar = (Button) findViewById(R.id.btAplicacaoInsumoInsumoVoltar);
        btAplicacaoInsumoInsumoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoInsumo.this, AplicacaoInsumoData.class);
                startActivity(intent);
                finish();
            }
        });

        btAplicacaoInsumoInsumoProximo = (Button) findViewById(R.id.btAplicacaoInsumoInsumoProximo);
        btAplicacaoInsumoInsumoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AplicacaoInsumoInsumo.this, AplicacaoInsumoQuantidade.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
