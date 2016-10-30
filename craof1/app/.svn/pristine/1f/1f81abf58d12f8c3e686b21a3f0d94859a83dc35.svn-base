package br.com.screen.craof.insumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import br.com.R;
import br.com.org.entidade.craof.Insumo;

/**
 * Created by Luan on 29/10/2016.
 */
public class InsumosIngredientes extends Activity {
    Button btProximo;
    Button btCancelar;
    Button btVoltar;
    ArrayList<Insumo> ingredientes;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insumos_ingredientes);
        Intent intent = getIntent();
        final Insumo insumo = (Insumo) intent.getSerializableExtra("insumo");
        if(insumo.getListaInsumo().size()>0){

        }
        btProximo = (Button) findViewById(R.id.btProximo);
        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsumosIngredientes.this, InsumosVisualizar.class);
                intent.putExtra("insumo", insumo);
                startActivity(intent);
                finish();
            }
        });
        btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsumosIngredientes.this, InsumosPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btVoltar = (Button) findViewById(R.id.btCancelar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsumosIngredientes.this, InsumosDescricao.class);
                intent.putExtra("insumo", insumo);
                startActivity(intent);
                finish();
            }
        });


    }
}
