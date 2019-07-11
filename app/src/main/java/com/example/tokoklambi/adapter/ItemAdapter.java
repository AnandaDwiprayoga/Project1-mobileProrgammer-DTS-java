package com.example.tokoklambi.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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


    public List<Item_makanan> getListItem() {
        return listItem;
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
        EditText jmlh;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            label = itemView.findViewById(R.id.label);
            harga = itemView.findViewById(R.id.harga);
            gambar = itemView.findViewById(R.id.gambar);
            jmlh = itemView.findViewById(R.id.inputQty);

            jmlh.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Item_makanan item_makanan  = listItem.get(getAdapterPosition());
                    item_makanan.setJumlah(Integer.parseInt(jmlh.getText().toString()));
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }
    }
}
