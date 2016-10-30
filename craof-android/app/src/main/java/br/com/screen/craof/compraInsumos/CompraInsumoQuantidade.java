package br.com.screen.craof.compraInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.R;
import br.com.org.entidade.craof.AplicacaoInsumo;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoCultura;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoInsumo;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoPrincipal;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class CompraInsumoQuantidade extends Activity {
    Button btCompraInsumoQuantidadeCancelar, btCompraInsumoQuantidadeProximo, btCompraInsumoQuantidadeVoltar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprainsumo_quantidade);

      /*  final AplicacaoInsumo aplicacaoInsumo = (AplicacaoInsumo) getIntent().getSerializableExtra("intent");
        if (aplicacaoInsumo != null)
            ((EditText) findViewById(R.id.etAplicacaoInsumoQuantidade)).setText(aplicacaoInsumo.getQuantidade());*/

        btCompraInsumoQuantidadeCancelar = (Button) findViewById(R.id.btCompraInsumoQuantidadeCancelar);
        btCompraInsumoQuantidadeCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoQuantidade.this, CompraInsumoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoQuantidadeVoltar = (Button) findViewById(R.id.btCompraInsumoQuantidadeVoltar);
        btCompraInsumoQuantidadeVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoQuantidade.this, CompraInsumoInsumo.class);
               /* AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                aplicacaoInsumo.setQuantidade(((EditText) findViewById(R.id.etAplicacaoInsumoQuantidade)).getText().toString());
                intent.putExtra("insumo", aplicacaoInsumo);*/
                startActivity(intent);
                finish();
            }
        });

        btCompraInsumoQuantidadeProximo = (Button) findViewById(R.id.btCompraInsumoQuantidadeProximo);
        btCompraInsumoQuantidadeProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoQuantidade.this, CompraInsumoFinalidade.class);
                /*AplicacaoInsumo aplicacaoInsumo1 = new AplicacaoInsumo();
                aplicacaoInsumo.setQuantidade(((EditText) findViewById(R.id.etAplicacaoInsumoQuantidade)).getText().toString());
                intent.putExtra("insumo", aplicacaoInsumo);*/
                startActivity(intent);
                finish();
            }
        });
    }
}
