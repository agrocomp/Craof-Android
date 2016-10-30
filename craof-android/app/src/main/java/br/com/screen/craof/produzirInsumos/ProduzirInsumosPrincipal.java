package br.com.screen.craof.produzirInsumos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.R;
import br.com.screen.craof.MainActivity;
import br.com.screen.craof.aplicacaoInsumo.AplicacaoInsumoData;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class ProduzirInsumosPrincipal extends Activity{
    Button btProduzirInsumosNovaFicha;
    Button btProduzirInsumosVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produzirinsumo_principal);

        btProduzirInsumosVoltar = (Button) findViewById(R.id.btProduzirInsumoVoltar);
        btProduzirInsumosVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProduzirInsumosPrincipal.this, MainActivity.class));
            }
        });

        btProduzirInsumosNovaFicha = (Button) findViewById(R.id.btProduzirInsumoNovaFicha);
        btProduzirInsumosNovaFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduzirInsumosPrincipal.this, ProduzirInsumosData.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
