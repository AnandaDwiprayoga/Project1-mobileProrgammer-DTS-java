package com.example.tokoklambi;

import android.os.Parcel;
import android.os.Parcelable;

public class Item_makanan implements Parcelable {
    String nama,harga;
    int img, jumlah;

    public Item_makanan(String nama, String harga, Integer img) {
        this.nama = nama;
        this.harga = harga;
        this.img = img;
    }

    protected Item_makanan(Parcel in) {
        nama = in.readString();
        harga = in.readString();
        img = in.readInt();
        jumlah = in.readInt();
    }

    public static final Creator<Item_makanan> CREATOR = new Creator<Item_makanan>() {
        @Override
        public Item_makanan createFromParcel(Parcel in) {
            return new Item_makanan(in);
        }

        @Override
        public Item_makanan[] newArray(int size) {
            return new Item_makanan[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Item_makanan{" +
                "nama='" + nama + '\'' +
                ", harga='" + harga + '\'' +
                ", img=" + img +
                ", jumlah=" + jumlah +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(harga);
        parcel.writeInt(img);
        parcel.writeInt(jumlah);
    }
}
