package br.com.screen.craof.destinoproduto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.R;

/**
 * Created by Luan on 30/10/2016.
 */
public class DestinoProdutoQuantidade extends Activity {
    Button btDestinoProdutosQuantidadeProximo;
    Button btDestinoProdutosQuantidadeVoltar;
    Button btDestinoProdutosQuantidadeCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinoprodutos_quantidade);



        btDestinoProdutosQuantidadeCancelar = (Button) findViewById(R.id.btDestinoProdutosQuantidadeCancelar);
        btDestinoProdutosQuantidadeCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoQuantidade.this, DestinoProdutoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosQuantidadeVoltar = (Button) findViewById(R.id.btDestinoProdutosQuantidadeVoltar);
        btDestinoProdutosQuantidadeVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoQuantidade.this, DestinoProdutoCultura.class);
                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosQuantidadeProximo = (Button) findViewById(R.id.btDestinoProdutosQuantidadeProximo);
        btDestinoProdutosQuantidadeProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoQuantidade.this, DestinoProdutoLocal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
