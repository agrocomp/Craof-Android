package br.com.screen.craof.destino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.SQLException;

import br.com.R;
import br.com.org.controle.craof.Controle_CRUD_Cultura;
import br.com.org.controle.craof.Controle_CRUD_Destino;
import br.com.org.controle.craof.Controle_CRUD_Local;
import br.com.org.entidade.craof.Cultura;
import br.com.org.entidade.craof.LocalDestino;
import br.com.screen.craof.cultura.CulturaDescricao;
import br.com.screen.craof.cultura.CulturaPrincipal;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class DestinoVisualizar extends Activity {
    Button btDestinoVisualizarVoltar, btDestinoVisualizarCancelar, btDestinoVisualizarSalvar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino_visualzar);
        Intent intent = getIntent();
        btDestinoVisualizarSalvar = (Button) findViewById(R.id.btDestinoDescricaoCancelar);
        btDestinoVisualizarSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DestinoVisualizar.this, DestinoPrincipal.class));
                finish();
            }
        });
        btDestinoVisualizarVoltar = (Button) findViewById(R.id.btDestinoDescricaoCancelar);
        btDestinoVisualizarVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoVisualizar.this, DestinoDescricao.class);
                startActivity(intent);
                finish();
            }
        });
        btDestinoVisualizarCancelar = (Button) findViewById(R.id.btDestinoDescricaoCancelar);
        btDestinoVisualizarCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoVisualizar.this, DestinoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
