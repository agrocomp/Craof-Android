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
public class DestinoProdutoDestino extends Activity{
    Button btDestinoProdutosDestinoProximo;
    Button btDestinoProdutosDestinoVoltar;
    Button btDestinoProdutosDestinoCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinoprodutos_destino);



        btDestinoProdutosDestinoCancelar = (Button) findViewById(R.id.btDestinoProdutosDestinoCancelar);
        btDestinoProdutosDestinoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoDestino.this, DestinoProdutoPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosDestinoVoltar = (Button) findViewById(R.id.btDestinoProdutosDestinoVoltar);
        btDestinoProdutosDestinoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoDestino.this, DestinoProdutoLocal.class);

                startActivity(intent);
                finish();
            }
        });

        btDestinoProdutosDestinoProximo = (Button) findViewById(R.id.btDestinoProdutosDesitnoProximo);
        btDestinoProdutosDestinoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoDestino.this, DestinoProdutoVisualizar.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
