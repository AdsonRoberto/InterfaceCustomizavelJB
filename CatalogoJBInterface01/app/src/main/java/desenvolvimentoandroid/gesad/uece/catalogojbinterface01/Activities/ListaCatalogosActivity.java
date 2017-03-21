package desenvolvimentoandroid.gesad.uece.catalogojbinterface01.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import desenvolvimentoandroid.gesad.uece.catalogojbinterface01.R;

public class ListaCatalogosActivity extends AppCompatActivity {

    private ListView listaCatalogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_catalogos);

        registerForContextMenu(listaCatalogos);

        String[] catalogos = { "Catálogo 1", "Catálogo 2", "Catálogo 3", "Catálogo 4", "Catálogo 5",
                "Catálogo 6", "Catálogo 7", "Catálogo 8", "Catálogo 9", "Catálogo 10", "Catálogo 11"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_selectable_list_item, catalogos);
        this.listaCatalogos = (ListView)findViewById(R.id.lista_catalogos);
        this.listaCatalogos.setAdapter(adapter);

        Toast.makeText(this, "Lista de catálogos", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_lista_catalogos,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.buscar_catalogo:
                break;
            case R.id.adicionar_catalogo:
                Intent intentAdicionarCatalogo = new Intent(this,CadastroCatalogoActivity.class);
                startActivity(intentAdicionarCatalogo);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuItem detalhes = menu.add("DETALHES DO CATÁLOGO");
        detalhes.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intentDetalhesCatalogo = new Intent(ListaCatalogosActivity.this, DetalhesCatalogoActivity.class);
                return false;
            }
        });

        MenuItem editar = menu.add("EDITAR CATÁLOGO");
        editar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        MenuItem excluir = menu.add("EXCLUIR CATÁLOGO");
        excluir.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        super.onCreateContextMenu(menu, v, menuInfo);
    }
}


