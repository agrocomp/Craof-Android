package br.com.screen.craof.insumos;


import br.com.R;
import br.com.org.ItemListView;
import br.com.org.controle.craof.Controle_CRUD_Cultura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class InsumosPrincipal extends AppCompatActivity {

    //Principal Insumo;
    Button btNovoInsumo;
    Button btVoltar;
    //Insumo cadastra1;
    ListView listView;
    private ArrayList<ItemListView> itens;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultura_principal);
        btNovoInsumo = (Button) findViewById(R.id.btNovoInsumo);
        btNovoInsumo.setOnClickListener(novoCadastro());
        listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> list = new Controle_CRUD_Cultura().buscarTodos();
        Log.i("HAC", list.size() + "");

        if (list != null && list.size() > 0)
            listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Clicou no item na posição " + position, Toast.LENGTH_SHORT).show();
            }
        });

        btVoltar = (Button) findViewById(R.id.btCancelar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //voltar para principal;
                finish();
            }
        });

    }

    public View.OnClickListener novoCadastro() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsumosPrincipal.this, InsumosDescricao.class);
                startActivity(intent);
                finish();
            }
        };
    }

}
