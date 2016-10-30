package br.com.screen.craof.controlePlantio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.R;

/**
 * Created by Luan on 30/10/2016.
 */
public class ControlePlantioCultura extends Activity{
    Button btControlePlantioCulturaProximo;
    Button btControlePlantioCulturaVoltar;
    Button btControlePlantioCulturaCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controleplantio_cultura);
        btControlePlantioCulturaCancelar = (Button) findViewById(R.id.btControlePlantioCulturaCancelar);
        btControlePlantioCulturaCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioCultura.this, ControlePlantioPrincipal.class));
                finish();
            }
        });
        btControlePlantioCulturaProximo = (Button) findViewById(R.id.btControlePlantioCulturaProximo);
        btControlePlantioCulturaProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioCultura.this, ControlePlantioQuantidade.class));
                finish();
            }
        });
        btControlePlantioCulturaVoltar = (Button) findViewById(R.id.btControlePlantioCulturaVoltar);
        btControlePlantioCulturaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioCultura.this, ControlePlantioData.class));
                finish();
            }
        });
    }

}
