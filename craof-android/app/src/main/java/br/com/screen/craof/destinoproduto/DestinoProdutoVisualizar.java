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
public class DestinoProdutoVisualizar extends Activity {
    Button btDestinoProdutosVisualizarSalvar;
    Button btDestinoProdutosVisualizarVoltar;
    Button btDestinoProdutosVisualizarCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinoprodutos_visualizar);



        btDestinoProdutosVisualizarCancelar = (Button) findViewById(R.id.btDestinoProdutosVisualizarCancelar);
        btDestinoProdutosVisualizarCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoVisualizar.this, DestinoProdutoPrincipal.class);
                startActivity(intent);
            }
        });

        btDestinoProdutosVisualizarVoltar = (Button) findViewById(R.id.btDestinoProdutosVisualizarVoltar);
        btDestinoProdutosVisualizarVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoVisualizar.this, DestinoProdutoDestino.class);
                startActivity(intent);
            }
        });

        btDestinoProdutosVisualizarSalvar = (Button) findViewById(R.id.btDestinoProdutosVisualizarSalvar);
        btDestinoProdutosVisualizarSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoProdutoVisualizar.this, DestinoProdutoPrincipal.class);
                startActivity(intent);
            }
        });
    }
}
