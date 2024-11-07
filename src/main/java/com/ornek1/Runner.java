package com.ornek1;

public class Runner {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci(); // öğrenci nesnesi
        ogr1.ad = "Tekin TAŞKIN";
        ogr1.adres = "Ankara";
        ogr1.okulNo = "OKL-01223";
        ogr1.sinif = "7C";
        ogr1.veli = "Hakan";

        Ogrenci ogr2 = new Ogrenci();
        ogr2.ad = "Bahar BELKİN";
        ogr2.adres = "Ankara";
        ogr2.okulNo = "OKL-03443";
        ogr2.sinif = "7B";
        ogr2.veli = "Elmas";

        Ogrenci[] ogrenciler = new Ogrenci[2];
        ogrenciler[0] = ogr1;
        ogrenciler[1] = ogr2;

        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(i+1+". öğrencinin adı....: "+ ogrenciler[i].ad);
        }

    }
}
