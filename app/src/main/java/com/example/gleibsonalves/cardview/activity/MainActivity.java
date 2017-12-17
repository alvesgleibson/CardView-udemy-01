package com.example.gleibsonalves.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.gleibsonalves.cardview.R;
import com.example.gleibsonalves.cardview.adapter.PostagemAdapter;
import com.example.gleibsonalves.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMain;
    private List<Postagem> postagems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewMain = findViewById(R.id.recyclerViewPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManagervar = new LinearLayoutManager(this);
       //## LinearLayoutManager layoutManagervar = new LinearLayoutManager(this);
        //##layoutManagervar.setOrientation(LinearLayout.HORIZONTAL);

       // RecyclerView.LayoutManager layaLayoutManager = new GridLayoutManager( this,2 );

        recyclerViewMain.setLayoutManager(layoutManagervar);

        //define adapter
        this.prepararPostagem();
        //PostagemAdapter adapter;
        recyclerViewMain.setAdapter( new PostagemAdapter(postagems) );

    }

    public void prepararPostagem(){
        Postagem p = new Postagem("Gleibson","Indo para o Canada", R.drawable.imagem1);
        this.postagems.add(p);

         p = new Postagem("Mylena","Indo para o Australia", R.drawable.imagem2);
        this.postagems.add(p);

         p = new Postagem("Mylena","No Canada", R.drawable.imagem3);
        this.postagems.add(p);

        p = new Postagem("Gleibson","Vivendo", R.drawable.imagem4);
        this.postagems.add(p);

    }

}
