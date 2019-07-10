package com.example.tokoklambi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tokoklambi.adapter.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item_makanan> listItemMakanan = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvMain);
        listItemMakanan.add(new Item_makanan("Pizza","100000", R.drawable.pizza));
        listItemMakanan.add(new Item_makanan("kebab","20000", R.drawable.kebab));
        listItemMakanan.add(new Item_makanan("Voguerina","15000", R.drawable.voguerena));
        listItemMakanan.add(new Item_makanan("Hot Dog","30000", R.drawable.hotdock));
        listItemMakanan.add(new Item_makanan("KFC","50000", R.drawable.kfc));
        listItemMakanan.add(new Item_makanan("Pizza","200000", R.drawable.pizza));
        listItemMakanan.add(new Item_makanan("Pisang Coklat","5000", R.drawable.piscok));

        ItemAdapter itemAdapter = new ItemAdapter(listItemMakanan);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void clickBuy(View view) {
        Intent intent = new Intent(this, InputActivity.class);
        startActivity(intent);
    }
}
