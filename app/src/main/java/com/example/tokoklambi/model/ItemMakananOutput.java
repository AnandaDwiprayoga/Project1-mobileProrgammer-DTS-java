package com.example.tokoklambi.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemMakananOutput implements Parcelable {

    String nama, harga;

    public ItemMakananOutput(String nama, String harga) {
        this.nama = nama;
        this.harga = harga;
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.harga);
    }

    protected ItemMakananOutput(Parcel in) {
        this.nama = in.readString();
        this.harga = in.readString();
    }

    public static final Parcelable.Creator<ItemMakananOutput> CREATOR = new Parcelable.Creator<ItemMakananOutput>() {
        @Override
        public ItemMakananOutput createFromParcel(Parcel source) {
            return new ItemMakananOutput(source);
        }

        @Override
        public ItemMakananOutput[] newArray(int size) {
            return new ItemMakananOutput[size];
        }
    };
}
