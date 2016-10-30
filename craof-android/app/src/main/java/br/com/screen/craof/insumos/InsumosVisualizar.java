package br.com.screen.craof.insumos;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.SQLException;

import br.com.R;
import br.com.org.controle.craof.Controle_CRUD_Insumo;
import br.com.org.entidade.craof.Insumo;


public class InsumosVisualizar extends AppCompatActivity {
    Button btSalvar;
    Button btCancelar;
    Button btVoltar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insumos_visualizar);
        Intent intent = getIntent();
        final Insumo insumo= (Insumo) intent.getSerializableExtra("insumo");
        ((TextView) findViewById(R.id.descricaoCultura)).setText(insumo.getDescricao());
        btSalvar = (Button) findViewById(R.id.btCancelar);
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Controle_CRUD_Insumo controle = new Controle_CRUD_Insumo();
                try {
                    controle.salvar(insumo);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(InsumosVisualizar.this, InsumosPrincipal.class));
                finish();
            }
        });
        btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsumosVisualizar.this, InsumosPrincipal.class);
                startActivity(intent);
                finish();

            }
        });
        btVoltar = (Button) findViewById(R.id.btCancelar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(insumo.getFlagProducao()) intent = new Intent(InsumosVisualizar.this, InsumosIngredientes.class);
                else intent = new Intent(InsumosVisualizar.this, InsumosDescricao.class);
                intent.putExtra("insumo", insumo);
                startActivity(intent);
                finish();
            }
        });
    }
}
