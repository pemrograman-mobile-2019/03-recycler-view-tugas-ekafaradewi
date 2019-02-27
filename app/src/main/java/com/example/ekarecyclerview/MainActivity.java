package com.example.ekarecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ekarecyclerview.adapter.ResepAdapter;
import com.example.ekarecyclerview.models.Resep;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Resep> resepList = new ArrayList<>();
        resepList.add(new Resep("album_1", "Ayam","Ayam yang di sajikan menggunakan sayuran dan bumbu",R.drawable.ayam));
        resepList.add(new Resep("album_2", "Salad","Masakan dengan perpaduan buah dan sayur", R.drawable.buah));
        resepList.add(new Resep("album_3", "Burger","Burger dengan daging sapi dan sayuran serta mayonaise yang gurih", R.drawable.bur));
        resepList.add(new Resep("album_4", "Cokkies","Biskuit coklat dan chocochips" ,R.drawable.cokies));
        resepList.add(new Resep("album_5", "Macaroni","macaroni dengan sambal hijau" ,R.drawable.pas));
        resepList.add(new Resep("album_6", "Pasta Macaroni","pasta dengan saus tomat dan keju mozarella" , R.drawable.satu));
        resepList.add(new Resep("album_7", "Spagetti", "Spaghetti dengan tomat segar", R.drawable.spa));
        resepList.add(new Resep("album_8", "Sushi", "sushi yang berisi nasi dengan tuna", R.drawable.sus));
        resepList.add(new Resep("album_9", "Telur", "Telur dengan sayur", R.drawable.tlr));
        resepList.add(new Resep("album_10", "Pizza","Pizza dengan Topping Sosis dan Keju cheddar", R.drawable.za));

        ResepAdapter adapterResep= new ResepAdapter(resepList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Resep);
        recyclerView.setAdapter(adapterResep);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
