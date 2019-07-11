package com.example.tokoklambi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tokoklambi.Item_makanan;
import com.example.tokoklambi.R;
import com.example.tokoklambi.model.ItemMakananOutput;

import java.lang.reflect.Array;
import java.util.List;

public class ItemAdapter2 extends RecyclerView.Adapter<ItemAdapter2.MyViewHolder2> {

    List<ItemMakananOutput> itemMakananOutputs;

    public ItemAdapter2(List<ItemMakananOutput> itemMakananOutputs) {
        this.itemMakananOutputs = itemMakananOutputs;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewItemOutput = layoutInflater.inflate(R.layout.item_satuan_out,parent,false);
        MyViewHolder2 myViewHolder2 = new MyViewHolder2(viewItemOutput);
        return  myViewHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        ItemMakananOutput itemMakananOutput = itemMakananOutputs.get(position);

        holder.nama.setText(itemMakananOutput.getNama());
        holder.harga.setText(itemMakananOutput.getHarga());
    }

    @Override
    public int getItemCount() {
        return itemMakananOutputs.size();
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {
        TextView nama,harga;
        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.labelNamaa);
            harga = itemView.findViewById(R.id.hargaa);
        }
    }
}
