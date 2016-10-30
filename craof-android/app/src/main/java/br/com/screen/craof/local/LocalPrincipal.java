package br.com.screen.craof.local;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.R;
import br.com.org.ItemListView;
import br.com.org.controle.craof.Controle_CRUD_Cultura;
import br.com.org.controle.craof.Controle_CRUD_Local;
import br.com.screen.craof.cultura.CulturaDescricao;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class LocalPrincipal extends Activity {
    //Principal Local;
    Button btNovoLocal, btLocalVoltar;

    //Local cadastra1;
    ListView listViewLocal;
    private ArrayList<ItemListView> itensLocal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultura_principal);
        btNovoLocal = (Button) findViewById(R.id.btNovoLocal);
        btNovoLocal.setOnClickListener(novoCadastroLocal());
        listViewLocal = (ListView) findViewById(R.id.listView);

        btLocalVoltar = (Button) findViewById(R.id.btLocalVoltar);
        btLocalVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //voltar para principal;
                finish();
            }
        });

    }

    public View.OnClickListener novoCadastroLocal() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocalPrincipal.this, LocalDescricao.class);
                startActivity(intent);
                finish();
            }
        };
    }

}
