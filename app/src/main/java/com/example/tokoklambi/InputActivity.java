package com.example.tokoklambi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.tokoklambi.adapter.ItemAdapter2;
import com.example.tokoklambi.model.ItemMakananOutput;

import java.util.ArrayList;
import java.util.List;

public class InputActivity extends AppCompatActivity {

//    RecyclerView recyclerViewOut;
//    private Object ItemMakananOutput;
//    String[] nama;
//    int[] totHarga;
    EditText nama, notelp, alamat;
    RadioGroup radioGroup;
    RadioButton radioButton;
    List<ItemMakananOutput> itemMakananOutputList  = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

//        recyclerViewOut = findViewById(R.id.rvItemOut);
//        nama = getIntent().getStringArrayExtra(new MainActivity().key_label);
//        totHarga = getIntent().getIntArrayExtra(new MainActivity().key_totHarga);
//
//        for(int i =0; i < nama.length && i < totHarga.length ;i++){
//            itemMakananOutputList.add(new ItemMakananOutput(nama[i], String.valueOf(totHarga[i])));
//        }
//
//        ItemAdapter2 itemAdapter2 = new ItemAdapter2(itemMakananOutputList);
//        recyclerViewOut.setAdapter(itemAdapter2);
//        recyclerViewOut.setLayoutManager(new LinearLayoutManager(this));
          nama = findViewById(R.id.inputNama);
          notelp = findViewById(R.id.inputNoTelp);
          alamat= findViewById(R.id.inputAlamat);
          radioGroup = findViewById(R.id.radioGroup);


    }

    public void clickFinish(View view) {
        radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        if(TextUtils.isEmpty(nama.getText().toString().trim()) || TextUtils.isEmpty(notelp.getText().toString().trim()) || TextUtils.isEmpty(alamat.getText().toString().trim())){
            Toast.makeText(this, "Form tidak boleh kosong",Toast.LENGTH_SHORT).show();
        }else if(!radioButton.isSelected()){
            Toast.makeText(this,"Pilih metode pembayaran", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(InputActivity.this, SuccessActivity.class);
            startActivity(intent);
        }
    }
}
