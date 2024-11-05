package com.ornekler;

public class MusteriListesi {
    String[] musteriler= null;
    int size;

    public void init(int diziBoyutu){
        musteriler = new String[diziBoyutu];
        size = diziBoyutu;
    }

    public boolean kontrolEt(){
        if(musteriler==null){
            System.out.println("Lütfen öncelikle diziyi başlatın.");
            return true;
        }
        return false;
    }

    public void insertMusteri(int index, String musteriAdi){
        if(kontrolEt()) return;
        musteriler[index] = musteriAdi;
    }

    public void printMusteri(){
        if(kontrolEt()) return;
        for(int i=0;i<size;i++){
            System.out.println(i+1+". Müşteri....: "+musteriler[i]);
        }
    }

    public int searchMusteri(String musteriAdi){
        if(kontrolEt()) return -1;
        int findIndex = -1;
       for(int i=0;i<size;i++){
           if(musteriler[i]!=null && musteriler[i].equalsIgnoreCase(musteriAdi)){
               findIndex = i;
               break;
           }
       }
       return findIndex;
    }

    public String findMusteriByIndex(int index){
        if(kontrolEt()) return "";
        return musteriler[index];
    }

}
