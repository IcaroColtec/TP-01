package co.example.kerli.trabalhotp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityAdapter extends BaseAdapter {

    // lista que conterá a linguagens a serem exibidas
    private ArrayList<Filme> filmes;
    private Context context;

    public MainActivityAdapter(Context context) {
        this.context = context;
        filmes = new ArrayList<>();
        //... carrega dados da lista
    }

    @Override
    public int getCount() {
        return this.filmes.size();
    };

    @Override
    public Object getItem(int i) {
        return this.filmes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        Filme filme = this.filmes.get(i);

        // cria o componente que será carregado na lista
        TextView lblFilme = new TextView(this.context);
        lblFilme.setText(filme.getFilme()+"/"+filme.getDiretor()+"/"+filme.getGenero()+"/"+filme.getlancamento()+"/"+filme.getfaixa());

        return lblFilme;
    }
}
