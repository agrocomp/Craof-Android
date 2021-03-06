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
public class ProduzirInsumosQuantidade extends Activity {
    Button btProduzirInsumoQuantidadeCancelar, btProduzirInsumoQuantidadeProximo,btProduzirInsumoQuantidadeVoltar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produzirinsumo_quantidade);

      /*  final AplicacaoInsumo aplicacaoInsumo = (AplicacaoInsumo) getIntent().getSerializableExtra("intent");
        if (aplicacaoInsumo != null)
            ((EditText) findViewById(R.id.etAplicacaoInsumoQuantidade)).setText(aplicacaoInsumo.getQuantidade());*/

        btProduzirInsumoQuantidadeCancelar = (Button) findViewById(R.id.btProduzirInsumoQuantidadeCancelar);
        btProduzirInsumoQuantidadeCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosQuantidade.this, ProduzirInsumosPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btProduzirInsumoQuantidadeVoltar = (Button) findViewById(R.id.btProduzirInsumoQuantidadeVoltar);
        btProduzirInsumoQuantidadeVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosQuantidade.this, ProduzirInsumosProdutos.class);
               /* AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                aplicacaoInsumo.setQuantidade(((EditText) findViewById(R.id.etAplicacaoInsumoQuantidade)).getText().toString());
                intent.putExtra("insumo", aplicacaoInsumo);*/
                startActivity(intent);
                finish();
            }
        });

        btProduzirInsumoQuantidadeProximo = (Button) findViewById(R.id.btProduzirInsumoQuantidadeProximo);
        btProduzirInsumoQuantidadeProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosQuantidade.this, ProduzirInsumosVisualizar.class);
                /*AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                aplicacaoInsumo.setQuantidade(((EditText) findViewById(R.id.etAplicacaoInsumoQuantidade)).getText().toString());
                intent.putExtra("insumo", aplicacaoInsumo);*/
                startActivity(intent);
                finish();
            }
        });
    }
}
