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
public class DestinoProdutoCultura extends Activity {
    Button btDestinoProdutosCulturaProximo;
    Button btDestinoProdutosCulturaVoltar;
    Button btDestinoProdutosCulturaCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinoprodutos_cultura);


        btDestinoProdutosCulturaCancelar = (Button) findViewById(R.id.btDestinoProdutosCulturaCancelar);
        btDestinoProdutosCulturaCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoCultura.this, DestinoProdutoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosCulturaVoltar = (Button) findViewById(R.id.btDestinoProdutosCulturaVoltar);
        btDestinoProdutosCulturaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoCultura.this, DestinoProdutoData.class);
                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosCulturaProximo = (Button) findViewById(R.id.btDestinoProdutosCulturaProximo);
        btDestinoProdutosCulturaProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoCultura.this, DestinoProdutoQuantidade.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
