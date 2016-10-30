package br.com.screen.craof.produzirInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.R;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class ProduzirInsumosInsumo extends Activity {
    Button btProduzirInsumoInsumoVoltar, btProduzirInsumoInsumoProximo,btProduzirInsumoInsumoCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produzirinsumo_insumo);

        /*final AplicacaoInsumo aplicacaoInsumo = (AplicacaoInsumo) getIntent().getSerializableExtra("intent");
        if(aplicacaoInsumo != null) ((EditText) findViewById(R.id.etAplicacaoInsumoInsumo)).setText(aplicacaoInsumo.getInsumo().getDescricao());*/

        btProduzirInsumoInsumoCancelar = (Button) findViewById(R.id.btProduzirInsumoInsumoCancelar);
        btProduzirInsumoInsumoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosInsumo.this, ProduzirInsumosPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btProduzirInsumoInsumoVoltar = (Button) findViewById(R.id.btProduzirInsumoInsumoVoltar);
        btProduzirInsumoInsumoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosInsumo.this, ProduzirInsumosData.class);
                /*AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                Insumo insumo = new Insumo();
                insumo.setDescricao(((EditText) findViewById(R.id.etAplicacaoInsumoInsumo)).getText().toString());
                aplicacaoInsumo.setInsumo(insumo);
                intent.putExtra("insumo", aplicacaoInsumo);*/
                startActivity(intent);
                finish();
            }
        });

        btProduzirInsumoInsumoProximo = (Button) findViewById(R.id.btProduzirInsumoInsumoProximo);
        btProduzirInsumoInsumoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosInsumo.this, ProduzirInsumosProdutos.class);
               /* AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                Insumo insumo = new Insumo();
                insumo.setDescricao(((EditText) findViewById(R.id.etAplicacaoInsumoInsumo)).getText().toString());
                aplicacaoInsumo.setInsumo(insumo);
                intent.putExtra("insumo", aplicacaoInsumo);*/
                startActivity(intent);
                finish();
            }
        });
    }
}

