package co.example.kerli.trabalhotp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Adcionar_Filme extends AppCompatActivity {

    EditText Filme, Genero, Diretor, Lancamento, Faixa_Etaria;
    Button botaoAdicionarFilme;
    Filme novoFilme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adcionar_filme);


        //Pega as os id's das views no layout
        Filme = (EditText) findViewById(R.id.filme);
        Genero = (EditText) findViewById(R.id.genero);
        Diretor = (EditText) findViewById(R.id.diretor);
        Lancamento = (EditText) findViewById(R.id.lancamento);
        Faixa_Etaria = (EditText) findViewById(R.id.idade);
        botaoAdicionarFilme = (Button) findViewById(R.id.botaoAdicionarFilme);


        botaoAdicionarFilme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fFilme = Filme.getText().toString();
                String fGenero = Genero.getText().toString();
                String fDiretor = Diretor.getText().toString();
                int fLancamento = Integer.parseInt(Lancamento.getText().toString());
                int fFaixa_Etaria = Integer.parseInt(Faixa_Etaria.getText().toString());

                novoFilme = new Filme(fFilme, fGenero, fDiretor, fLancamento, fFaixa_Etaria);

                //Voltar para a tela inicial
                Intent intent = new Intent(Adcionar_Filme.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}