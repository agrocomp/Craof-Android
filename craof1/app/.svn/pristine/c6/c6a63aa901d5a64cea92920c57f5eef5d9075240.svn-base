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
public class ControlePlantioData extends Activity{
    Button btControlePlantioDataProximo;
    Button btControlePlantioDataCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controleplantio_data);
        btControlePlantioDataCancelar = (Button) findViewById(R.id.btControlePlantioDataCancelar);
        btControlePlantioDataCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioData.this, ControlePlantioPrincipal.class));
                finish();
            }
        });
        btControlePlantioDataProximo = (Button) findViewById(R.id.btControlePlantioDataProximo);
        btControlePlantioDataProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioData.this, ControlePlantioCultura.class));
                finish();
            }
        });
    }
}
