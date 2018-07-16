package br.com.josefsjunior.futebas.ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.josefsjunior.futebas.R;

public class LoginActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle(TITULO_APPBAR);

        textoCadastro();
        textoEsqueceuSenha();
        entrarApp();
    }

    private void entrarApp() {
        Button botaoEntrar = findViewById(R.id.login_botao_entrar);
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiProMenuInicial();
            }
        });
    }

    private void vaiProMenuInicial() {
        Intent intent = new Intent(LoginActivity.this, MenuInicialActivity.class);
        startActivity(intent);
    }

    private void textoEsqueceuSenha() {
        TextView esqueceuSenha = findViewById(R.id.login_texto_esqueceu_senha);
        esqueceuSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostraAlertDialog();
            }
        });
    }

    private void mostraAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(LoginActivity.this);
        alertDialog.setTitle("Redefinição de Senha");
        alertDialog.setMessage("Enviaremos em seu e-mail uma nova senha. Essa operação não pode ser desfeita.");
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(LoginActivity.this, "E-mail enviado!", Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //nao faz nada
            }
        });
        alertDialog.create();
        alertDialog.show();
    }

    private void textoCadastro() {
        TextView cadastrar = findViewById(R.id.login_texto_cadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiParaTelaCadastro();
            }
        });
    }

    private void vaiParaTelaCadastro() {
        Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(intent);
    }
}
