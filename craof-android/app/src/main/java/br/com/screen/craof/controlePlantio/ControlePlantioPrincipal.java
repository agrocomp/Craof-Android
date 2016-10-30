package br.com.screen.craof.controlePlantio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.Plantio;
import br.com.screen.craof.MainActivity;

/**
 * Created by Luan on 30/10/2016.
 */
public class ControlePlantioPrincipal extends Activity {
    Button btControlePlantioPrincipalNovaFicha;
    Button btControlePlantioVoltar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controleplantio_principal);




        btControlePlantioVoltar = (Button) findViewById(R.id.btControlePlantioVoltar);
        btControlePlantioVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioPrincipal.this, MainActivity.class));
                finish();
            }
        });

        btControlePlantioPrincipalNovaFicha = (Button) findViewById(R.id.btControlePlantioNovaFicha);
        btControlePlantioPrincipalNovaFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlePlantioPrincipal.this, ControlePlantioData.class));
                finish();
            }
        });
    }
}
