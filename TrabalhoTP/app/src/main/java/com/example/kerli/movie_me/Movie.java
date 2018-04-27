package com.example.kerli.movie_me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class adicionarImovel extends Activity {

    EditText Filme, Genero, Diretor, Lancamento, Faixa_Etaria;
    Button botaoAdicionarFilme;
    Filme novoFilme;
    add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_filme);



        //Pega as os id's das views no layout
        Filme = (EditText) findViewById(R.id.filme);
        Genero = (EditText) findViewById(R.id.genero);
        Diretor = (EditText) findViewById(R.id.diretor);
        Lancamento = (EditText) findViewById(R.id.lancamento);
        Faixa_Etaria = (EditText) findViewById(R.id.idade);
        botaoAdicionarFilme= (Button) findViewById(R.id.botaoAdicionarFilme);


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
                Intent intent = new Intent(adicionarImovel.this, MainActivity.class);
                startActivity(intent);


            }
        });

    }


}
