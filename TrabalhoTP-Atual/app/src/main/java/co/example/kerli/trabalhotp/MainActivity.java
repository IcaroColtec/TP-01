package co.example.kerli.trabalhotp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // faz a ligação entre a ListView e o Adapter
        ListView FilmesListView = findViewById(R.id.filmes_list);
        FilmesListView.setAdapter(new MainActivityAdapter(this));
    }
}
