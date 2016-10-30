package br.com.screen.craof.cultura;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.SQLException;

import br.com.R;
import br.com.org.controle.craof.Controle_CRUD_Cultura;
import br.com.org.entidade.craof.Cultura;

/**
 * Created by Luan on 29/10/2016.
 */
public class CulturaVisualizar extends Activity {
    Button btSalvar;
    Button btCancelar;
    Button btVoltar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultura_visualizar);
        Intent intent = getIntent();
        final Cultura cultura = (Cultura) intent.getSerializableExtra("cultura");
        ((TextView) findViewById(R.id.descricaoCultura)).setText(cultura.getNome());
        btSalvar = (Button) findViewById(R.id.btCancelar);
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Controle_CRUD_Cultura controle = new Controle_CRUD_Cultura();
                try {
                    controle.cadastrarCultura(cultura, null);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(CulturaVisualizar.this, CulturaPrincipal.class));
                finish();
            }
        });
        btVoltar = (Button) findViewById(R.id.btCancelar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CulturaVisualizar.this, CulturaDescricao.class);
                intent.putExtra("cultura", cultura);
                startActivity(intent);
                finish();
            }
        });
        btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CulturaVisualizar.this, CulturaPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

    }
}

