package br.com.screen.craof;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

import br.com.R;
import br.com.org.entidade.craof.DestinoProduto;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoPrincipal;
import br.com.screen.craof.compraInsumos.CompraInsumoPrincipal;
import br.com.screen.craof.controlePlantio.ControlePlantioPrincipal;
import br.com.screen.craof.destinoproduto.DestinoProdutoPrincipal;
import br.com.screen.craof.produzirInsumos.ProduzirInsumosPrincipal;

public class MainActivity extends Activity {

    ImageButton btAplicacaoInsumo, btCompraInsumos, btControlePlantio, btDestinoProduto, btProduzirInsumos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btAplicacaoInsumo = (ImageButton) findViewById(R.id.imageButton2);
        btAplicacaoInsumo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AplicacaoInsumoPrincipal.class));
            }
        });
        btCompraInsumos = (ImageButton) findViewById(R.id.imageButton5);
        btCompraInsumos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CompraInsumoPrincipal.class));
            }
        });
        btControlePlantio = (ImageButton) findViewById(R.id.imageButton);
        btControlePlantio.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ControlePlantioPrincipal.class));
            }
        });
        btDestinoProduto = (ImageButton) findViewById(R.id.imageButton3);
        btDestinoProduto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DestinoProdutoPrincipal.class));
            }
        });
        btProduzirInsumos = (ImageButton) findViewById(R.id.imageButton4);
        btProduzirInsumos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProduzirInsumosPrincipal.class));
            }
        });

    }





}

