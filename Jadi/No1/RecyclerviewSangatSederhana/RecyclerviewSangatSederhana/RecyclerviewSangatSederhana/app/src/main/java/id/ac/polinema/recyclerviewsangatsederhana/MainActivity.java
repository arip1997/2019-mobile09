package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapter.DummyHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.adapter.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.DummyHero;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<DummyHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);
        DummyHero hero = new DummyHero("Instagram", "https://img.icons8.com/cotton/2x/instagram-new.png");
        listSuperHero.add(hero);
        hero = new DummyHero("Twitter", "https://img.icons8.com/plasticine/2x/twitter.png");
        listSuperHero.add(hero);
        DummyHeroAdapter dummyHeroAdapter = new DummyHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(dummyHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
