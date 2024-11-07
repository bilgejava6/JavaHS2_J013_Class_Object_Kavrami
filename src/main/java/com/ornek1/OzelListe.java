package com.ornek1;

public class OzelListe {
   private String[] list = null;
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
        String[] tmp = list;// eski listem
        list = new String[size]; // yeni içi boş listem
        for(int i=0; i<tmp.length;i++){
            if(i<removeIndex) list[i] = tmp[i];
            else if(i>removeIndex) list[i-1]= tmp[i];
        }
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
