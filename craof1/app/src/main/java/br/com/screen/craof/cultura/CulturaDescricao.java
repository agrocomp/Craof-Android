package br.com.screen.craof.cultura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.Cultura;

public class CulturaDescricao extends AppCompatActivity {
    Button btCancelar;
    Button btProximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultura_descricao);
        btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CulturaDescricao.this, CulturaPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
        Cultura cultura = (Cultura) getIntent().getSerializableExtra("cultura");
        if(cultura !=null){
            ((EditText) findViewById(R.id.descricaoCultura)).setText(cultura.getNome());
        }
        btProximo = (Button) findViewById(R.id.btProximo);
        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cultura cultura = new Cultura();
                cultura.setNome(((EditText)findViewById(R.id.descricaoCultura)).getText().toString());
                Intent intent = new Intent(CulturaDescricao.this, CulturaVisualizar.class);
                intent.putExtra("cultura", cultura);
                startActivity(intent);
                finish();
            }
        });

    }

}
