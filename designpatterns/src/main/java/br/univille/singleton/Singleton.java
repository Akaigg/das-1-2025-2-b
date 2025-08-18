package br.univille.singleton;

public class Singleton {
    private static Singleton instance; //parece com uma variavel global

    private Singleton(){ //<-- ninguém pode instanciar(criar) a não ser ela mesma

    } 
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }  
}