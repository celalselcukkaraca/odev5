package com.rd;

public class Personel {
    String isim;
    private int gunlukUcret;

    public Personel(String isim, int gunlukUcret) {
        this.isim = isim;
        this.gunlukUcret = gunlukUcret;
    }

    public int maasHesapla(int calisilanGun) {
        // Temel maaş hesaplama
        int maas = gunlukUcret * calisilanGun;

        // Prim hesaplama (üçlü operatör kullanımı)
        int prim = (calisilanGun > 25) ? (calisilanGun - 25) * 1000 : 0;

        // Toplam maaş
        return maas + prim;
    }
}