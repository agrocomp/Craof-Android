package br.com.screen.craof.controlePlantio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.Plantio;

/**
 * Created by Luan on 30/10/2016.
 */
public class ControlePlantioQuantidade extends Activity{
    Button btControlePlantioQuantidadeProximo;
    Button btControlePlantioQuantidadeVoltar;
    Button btControlePlantioQuantidadeCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controleplantio_quantidade);


        btControlePlantioQuantidadeCancelar = (Button) findViewById(R.id.btControlePlantioQuantidadeCancelar);
        btControlePlantioQuantidadeCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlePlantioQuantidade.this, ControlePlantioPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btControlePlantioQuantidadeVoltar = (Button) findViewById(R.id.btControlePlantioQuantidadeVoltar);
        btControlePlantioQuantidadeVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlePlantioQuantidade.this, ControlePlantioCultura.class);
                startActivity(intent);
                finish();
            }
        });

        btControlePlantioQuantidadeProximo = (Button) findViewById(R.id.btControlePlantioQuantidadeProximo);
        btControlePlantioQuantidadeProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlePlantioQuantidade.this, ControlePlantioLocal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
