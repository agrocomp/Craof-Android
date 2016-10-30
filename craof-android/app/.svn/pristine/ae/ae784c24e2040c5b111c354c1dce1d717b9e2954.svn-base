package br.com.screen.craof.compraInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.R;
import br.com.org.ItemListView;
import br.com.screen.craof.MainActivity;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoData;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class CompraInsumoPrincipal extends Activity {

    Button btCompraInsumoVoltar,btCompraInsumoNovaFicha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprainsumo_principal);

        btCompraInsumoVoltar = (Button) findViewById(R.id.btCompraInsumoVoltar);
        btCompraInsumoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CompraInsumoPrincipal.this, MainActivity.class));
            }
        });

        btCompraInsumoNovaFicha = (Button) findViewById(R.id.btCompraInsumoNovaFicha);
        btCompraInsumoNovaFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraInsumoPrincipal.this, CompraInsumoData.class);
                startActivity(intent);
                finish();
            }
        });
    }



}


