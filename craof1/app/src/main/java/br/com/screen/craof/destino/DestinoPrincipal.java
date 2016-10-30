package br.com.screen.craof.destino;

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
import br.com.org.controle.craof.Controle_CRUD_Destino;
import br.com.screen.craof.cultura.CulturaDescricao;

/**
 * Created by Letícia Silva Souza on 30/10/2016.
 */
public class DestinoPrincipal extends Activity {

    Button btNovoDestino, btDestinoVoltar;

    ListView listViewDestino;
    private ArrayList<ItemListView> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino_principal);
        btNovoDestino = (Button) findViewById(R.id.btNovoLocal);
        btNovoDestino.setOnClickListener(novoCadastroDestino());
        listViewDestino = (ListView) findViewById(R.id.listViewDestino2);
        ArrayList<String> list = null;


        list = new Controle_CRUD_Cultura().buscarTodos();

        Log.i("HAC", list.size() + "");

        if (list != null && list.size() > 0)
            listViewDestino.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));


        listViewDestino.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Clicou no item na posição " + position, Toast.LENGTH_SHORT).show();
            }
        });

        btDestinoVoltar = (Button) findViewById(R.id.btCancelar);
        btDestinoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //voltar para principal;
                finish();
            }
        });


    }

    public View.OnClickListener novoCadastroDestino() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinoPrincipal.this, DestinoDescricao.class);
                startActivity(intent);
                finish();
            }
        };
    }


}
