package com.ornek1;

public class OzelListe {
   private Ogrenci[] list = null;
   private int size = 0;
   private int currentIndex = -1;

    public void remove(int removeIndex){
        if(removeIndex<0 || removeIndex>size) return;
        size--;
        currentIndex--;
        if(size==0){
            list = null;
            currentIndex= -1;
            return;
        }
        Ogrenci[] tmp = list;// eski listem
        list = new Ogrenci[size]; // yeni içi boş listem
        for(int i=0; i<tmp.length;i++){
            if(i<removeIndex) list[i] = tmp[i];
            else if(i>removeIndex) list[i-1]= tmp[i];
        }
    }

    public void update(int index, Ogrenci newValue) {
        if (index<0 || index>currentIndex) return;
        list[index] = newValue;
    }

    public void add(Ogrenci item){
        size++;
        currentIndex++;
        if(list==null){
            list = new Ogrenci[size];
            list[currentIndex] = item;
        }else{
            Ogrenci[] tmp = list;// mevcut listeyi geçici bir diziye koyuyorum.
            list = new Ogrenci[size];// liste yeni boyutu ile oluşturulur.
            for(int i=0;i<tmp.length;i++) // tmp içindeki değerleri yeni list e aktar
                list[i] = tmp[i];
            list[currentIndex] = item;
        }
    }

    public void list(){
        System.out.println("""
                ****** Öğrenci Listesi ******
                """);
        for (int i=0;i<size;i++){
            System.out.println("Öğrenci okulNo....: "+list[i].okulNo);
            System.out.println("Öğrenci ad........: "+list[i].ad);
            System.out.println("Öğrenci adres.....: "+list[i].adres);
            System.out.println("Öğrenci veli......: "+list[i].veli);
            System.out.println("Öğrenci sınıf.....: "+list[i].sinif);
            System.out.println("--------------------------------");
        }
    }

    public int size(){
        return size;
    }
}
