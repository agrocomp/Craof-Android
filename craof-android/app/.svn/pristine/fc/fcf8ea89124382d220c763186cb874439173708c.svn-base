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
public class DestinoProdutoData extends Activity{

    Button btDestinoProdutosDataProximo;
    Button btDestinoProdutosDataCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinoprodutos_data);

        btDestinoProdutosDataCancelar = (Button) findViewById(R.id.btDestinoProdutosDataCancelar);
        btDestinoProdutosDataCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DestinoProdutoData.this, DestinoProdutoPrincipal.class));
                finish();
            }
        });
        btDestinoProdutosDataProximo = (Button) findViewById(R.id.btDestinoProdutosDataProximo);
        btDestinoProdutosDataProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoData.this, DestinoProdutoCultura.class);
                startActivity(intent);
                finish();


            }
        });


    }
}
