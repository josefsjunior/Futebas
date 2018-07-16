package br.com.josefsjunior.futebas.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.josefsjunior.futebas.R;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        setTitle("Cadastre-se");
    }
}
