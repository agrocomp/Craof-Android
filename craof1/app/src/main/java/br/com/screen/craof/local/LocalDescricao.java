package br.com.screen.craof.local;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.LocalPlantio;
import br.com.screen.craof.cultura.CulturaVisualizar;


/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class LocalDescricao extends AppCompatActivity {

    Button btLocalDescricaoCancelar, btLocalDescricaoProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_descricao);

        btLocalDescricaoCancelar = (Button) findViewById(R.id.btLocalDescricaoCancelar);
        btLocalDescricaoProximo = (Button) findViewById(R.id.btLocalDescricaoProximo);

        btLocalDescricaoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocalDescricao.this, LocalPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        LocalPlantio localPlantio = (LocalPlantio) getIntent().getSerializableExtra("localPlantio");
        if(localPlantio !=null){
            ((EditText) findViewById(R.id.descricaoLocal)).setText(localPlantio.getDescricao());
        }

        btLocalDescricaoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocalDescricao.this, LocalVisualizar.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
