package com.example.tokoklambi;

public class Item_makanan {
    String nama,harga;
    Integer img;

    public Item_makanan(String nama, String harga, Integer img) {
        this.nama = nama;
        this.harga = harga;
        this.img = img;
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

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}
