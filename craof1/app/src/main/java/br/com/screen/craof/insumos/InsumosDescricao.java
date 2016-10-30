package br.com.screen.craof.insumos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import br.com.*;
import br.com.org.entidade.craof.Insumo;

public class InsumosDescricao extends AppCompatActivity {

    Button btCancelar;
    Button btProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insumos_descricao);
        btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsumosDescricao.this, InsumosPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
        Insumo insumo = (Insumo) getIntent().getSerializableExtra("intent");
        if(insumo != null) ((EditText) findViewById(R.id.descricaoInsumo)).setText(insumo.getDescricao());
        btProximo = (Button) findViewById(R.id.btProximo);
        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insumo insumo = new Insumo();
                insumo.setDescricao(((EditText) findViewById(R.id.descricaoInsumo)).getText().toString());
                insumo.setFlagProducao(((CheckBox) findViewById(R.id.check1)).isSelected() ? true : false);
                if(!insumo.getFlagProducao()){
                    Intent intent = new Intent(InsumosDescricao.this, InsumosVisualizar.class);
                    intent.putExtra("insumo", insumo);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(InsumosDescricao.this, InsumosIngredientes.class);
                    intent.putExtra("insumo", insumo);
                    startActivity(intent);
                }
                finish();

            }
        });
    }
}
