package com.ornekler;

public class OzelListe {
   private String[] list = null;
   private int size = 0;
   private int currentIndex = -1;
    /**
     * Ekle - Add
     * Araya Ekle - Insert
     * Sil - Delete/Remove
     * Güncelle - Update
     * Listele - List
     *
     */

    public void remove(int removeIndex){

    }

    public void update(int index, String newValue) {
        if (index<0 || index>currentIndex) return;
        list[index] = newValue;
    }

    public void add(String item){
        size++;
        currentIndex++;
        if(list==null){
            list = new String[size];
            list[currentIndex] = item;
        }else{
            String[] tmp = list;// mevcut listeyi geçici bir diziye koyuyorum.
            list = new String[size];// liste yeni boyutu ile oluşturulur.
            for(int i=0;i<tmp.length;i++) // tmp içindeki değerleri yeni list e aktar
                list[i] = tmp[i];
            list[currentIndex] = item;
        }
    }

    public void list(){
        for (int i=0;i<size;i++){
            System.out.println(list[i]);
        }
    }

    public int size(){
        return size;
    }
}
