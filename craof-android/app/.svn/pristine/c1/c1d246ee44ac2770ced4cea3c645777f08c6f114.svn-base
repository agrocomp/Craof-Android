package br.com.screen.craof.destino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.Cultura;
import br.com.org.entidade.craof.LocalDestino;
import br.com.screen.craof.cultura.CulturaPrincipal;
import br.com.screen.craof.cultura.CulturaVisualizar;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class DestinoDescricao extends AppCompatActivity {

    Button btDestinoDescricaoCancelar, btDestinoDescricaoProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino_descricao);
        btDestinoDescricaoCancelar = (Button) findViewById(R.id.btDestinoDescricaoCancelar);
        btDestinoDescricaoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoDescricao.this, DestinoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
        LocalDestino destino = (LocalDestino) getIntent().getSerializableExtra("destino");
        if(destino !=null){
            ((EditText) findViewById(R.id.editTextDestino)).setText(destino.getDescricao());
        }
        btDestinoDescricaoProximo = (Button) findViewById(R.id.btProximo);
        btDestinoDescricaoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DestinoDescricao.this, DestinoVisualizar.class);
                startActivity(intent);
                finish();
            }
        });

    }

}

