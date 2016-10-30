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
public class ControlePlantioLocal extends Activity{
    Button btControlePlantioLocalProximo;
    Button btControlePlantioLocalVoltar;
    Button btControlePlantioLocalCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controleplantio_local);
        btControlePlantioLocalCancelar = (Button) findViewById(R.id.btControlePlantioLocalCancelar);
        btControlePlantioLocalCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioLocal.this, ControlePlantioPrincipal.class));
                finish();
            }
        });
        btControlePlantioLocalProximo = (Button) findViewById(R.id.btControlePlantioLocalProximo);
        btControlePlantioLocalProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioLocal.this, ControlePlantioVisualizar.class));
                finish();
            }
        });
        btControlePlantioLocalVoltar = (Button) findViewById(R.id.btControlePlantioLocalVoltar);
        btControlePlantioLocalVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioLocal.this, ControlePlantioQuantidade.class));
                finish();
            }
        });
    }
}
