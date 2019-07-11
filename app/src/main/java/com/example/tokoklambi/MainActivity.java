package com.example.tokoklambi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.tokoklambi.adapter.ItemAdapter;
import com.example.tokoklambi.model.ItemMakananOutput;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getCanonicalName();
    List<Item_makanan> listItemMakanan = new ArrayList<>();
    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
//    public final String arrayKey = "arrayKey";
    public final String key_label = "key_label";
    public final String key_totHarga = "key_label";

    String[] label;
    int[] totHarga;
    int i = 0;

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

        itemAdapter = new ItemAdapter(listItemMakanan);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Button buyButton = findViewById(R.id.buttonBuy);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               List<ItemMakananOutput> items = new ArrayList<>();
                for (Item_makanan item : listItemMakanan) {
                    if (item.getJumlah() > 0) {
                        int harga = Integer.parseInt(item.getHarga().toString());
                        int jum = item.getJumlah();
                        int total = harga*jum;
//                       items.add(new ItemMakananOutput(item.getNama(),String.valueOf(total)));
                       // label[i] = item.getNama();
                        //totHarga[i] = total;
                        i++;
                    }
                }

                Intent intent = new Intent(MainActivity.this, InputActivity.class);
                startActivity(intent);
            }
        });
    }
}
