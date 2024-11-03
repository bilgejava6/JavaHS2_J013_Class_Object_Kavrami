package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        String ifade = "";
        /**
         * bir sınıftan nesne türetmek için
         * new anahtar kelimesi kullanırlır.
         */
        Islemler islem = new Islemler(); // yeni bir nesne yarat.
        int toplam = islem.toplama(5,2);
        System.out.println("toplam...: "+ toplam);
    }
}