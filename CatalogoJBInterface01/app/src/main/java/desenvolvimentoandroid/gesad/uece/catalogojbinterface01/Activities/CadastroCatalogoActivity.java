package desenvolvimentoandroid.gesad.uece.catalogojbinterface01.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import desenvolvimentoandroid.gesad.uece.catalogojbinterface01.R;

public class CadastroCatalogoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_catalogo);

        Button botaoCadastrarCatalogo = (Button)findViewById(R.id.bt_cadastrar_catalogo);

        botaoCadastrarCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CadastroCatalogoActivity.this, "Cadastro realizado com sucesso", Toast.LENGTH_LONG).show();
            }
        });
    }
}
