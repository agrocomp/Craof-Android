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
public class ControlePlantioVisualizar extends Activity {
    Button btControlePlantioVisualizarSalvar;
    Button btControlePlantioVisualizarVoltar;
    Button btControlePlantioVisualizarCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controleplantio_visualizar);
        btControlePlantioVisualizarCancelar = (Button) findViewById(R.id.btControlePlantioVisualizarCancelar);
        btControlePlantioVisualizarCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioVisualizar.this, ControlePlantioPrincipal.class));
                finish();
            }
        });
        btControlePlantioVisualizarSalvar = (Button) findViewById(R.id.btControlePlantioVisualizarSalvar);
        btControlePlantioVisualizarSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioVisualizar.this, ControlePlantioPrincipal.class));
                finish();
            }
        });
        btControlePlantioVisualizarVoltar = (Button) findViewById(R.id.btControlePlantioVisualizarVoltar);
        btControlePlantioVisualizarVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioVisualizar.this, ControlePlantioQuantidade.class));
                finish();
            }
        });
    }
}
