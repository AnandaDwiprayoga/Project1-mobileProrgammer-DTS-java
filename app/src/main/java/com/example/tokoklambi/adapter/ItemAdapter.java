package com.example.tokoklambi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tokoklambi.Item_makanan;
import com.example.tokoklambi.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    List<Item_makanan> listItem;

    public ItemAdapter(List<Item_makanan> listItem) {
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View item = layoutInflater.inflate(R.layout.item_satuan, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(item);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item_makanan item_makanan = listItem.get(position);
        holder.label.setText(item_makanan.getNama());
        holder.harga.setText(item_makanan.getHarga());
        holder.gambar.setImageResource(item_makanan.getImg());
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView label,harga;
        ImageView gambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            label = itemView.findViewById(R.id.label);
            harga = itemView.findViewById(R.id.harga);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
