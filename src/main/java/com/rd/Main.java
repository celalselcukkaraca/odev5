package com.rd;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Personel personel = new Personel("Ali", 1000);
        int calisilanGun = 28;
        int toplamMaas = personel.maasHesapla(calisilanGun);
        System.out.println(personel.isim + " adlı personelin toplam maaşı: " + toplamMaas + " TL");
    }
    }
