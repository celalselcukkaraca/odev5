package com.rd;

public class Muhasebe {
    private static final int GUNLUK_MAAS = 500;
    private static final int PRIM = 1000;
    private static final int PRIM_ESIGI = 25;

    public int maasHesapla(Personel personel) {
        int calismaGun = personel.getCalismaGun();
        int maas = calismaGun * GUNLUK_MAAS;
        int prim = calismaGun > PRIM_ESIGI ? (calismaGun - PRIM_ESIGI) * PRIM : 0;
        return maas + prim;
    }
}