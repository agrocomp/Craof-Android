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
public class DestinoProdutoLocal extends Activity{
    Button btDestinoProdutosLocalVoltar;
    Button btDestinoProdutosLocalCancelar;
    Button btDestinoProdutosLocalProximo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinoprodutos_local);


        btDestinoProdutosLocalCancelar = (Button) findViewById(R.id.btDestinoProdutosLocalCancelar);
        btDestinoProdutosLocalCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoLocal.this, DestinoProdutoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosLocalVoltar = (Button) findViewById(R.id.btDestinoProdutosLocalVoltar);
        btDestinoProdutosLocalVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoLocal.this, DestinoProdutoQuantidade.class);
                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosLocalProximo = (Button) findViewById(R.id.btDestinoProdutosLocalProximo);
        btDestinoProdutosLocalProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoLocal.this, DestinoProdutoDestino.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
