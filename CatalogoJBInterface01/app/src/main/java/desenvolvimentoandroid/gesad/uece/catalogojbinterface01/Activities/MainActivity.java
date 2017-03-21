package desenvolvimentoandroid.gesad.uece.catalogojbinterface01.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import desenvolvimentoandroid.gesad.uece.catalogojbinterface01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button botaoCatalogos = (Button)findViewById(R.id.bt_catalogo);


        //AÇÃO DO BOTÃO CATÁLOGOS
        botaoCatalogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentListarCatalogos = new Intent(MainActivity.this,ListaCatalogosActivity.class);
                startActivity(intentListarCatalogos);
            }
        });

        Toast.makeText(this, "Clique no ícone desejado para selecionar", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.help:

                Intent intentAjuda = new Intent(this,AjudaActivity.class);
                startActivity(intentAjuda);
                break;
            case R.id.informacao:

                Intent intentInformacao = new Intent(this,InformacaoActivity.class);
                startActivity(intentInformacao);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
