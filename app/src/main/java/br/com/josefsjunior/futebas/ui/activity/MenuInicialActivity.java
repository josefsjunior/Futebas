package br.com.josefsjunior.futebas.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.josefsjunior.futebas.R;

public class MenuInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);

        setTitle("Menu Inicial");

        Button botaoProcurarQuadras = findViewById(R.id.menu_inicial_botao_procurar_quadras_redor);
        botaoProcurarQuadras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuInicialActivity.this, ProcurarQuadrasActivity.class);
                startActivity(intent);
            }
        });
    }
}
