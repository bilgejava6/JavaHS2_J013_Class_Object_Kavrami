package com.ornekler;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * MüşteriListesi sınıfı içinde
         * 1- Müşterileri listeleyen bir method
         * 2- istenilen index e müşteri ekleyen bir method
         * 3- aranılan bir müşterinin index ini dönen bir method
         * 4- index i verilen müşteriyi dönen bir method tanımlayın.
         * DİKKAT!!!!!
         * müşteri dizisi ilk etapta boş bir dizidir. bu nedenle dizinin
         * başlatılması gereklidir. Bu işlemi yapan bir method yazın. bu
         * method dizinin boyutunu istesin ve diziyi oluştursun. Diğer methodlar
         * dizi başlatılmadan çalışırsa uyarı versin.
         *
         */

        MusteriListesi musteriListesi = new MusteriListesi();
        musteriListesi.init(5);
        musteriListesi.insertMusteri(0, "Muhammet");
        musteriListesi.insertMusteri(2, "Demet");
        musteriListesi.insertMusteri(4, "Hakan");
        musteriListesi.printMusteri();
        int index = musteriListesi.searchMusteri("Demet");
        System.out.println("bulunan index... :"+ index);
        String musteri = musteriListesi.findMusteriByIndex(4);
        System.out.println("musteri: " + musteri);
    }
}
