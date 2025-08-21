package br.univille.singleton;

public class Singleton {
    private static Singleton instance; //parece com uma variavel global
    private String segredo;

    public String getSegredo() {
        return segredo;
    }
    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }
    private Singleton(){ //<-- ninguém pode instanciar(criar) a não ser ela mesma
        System.out.println("Singleton: Construtor");
    } 
    public static Singleton getInstance(){
        System.out.println("Singleton: getInstance");
        if(instance == null){
            System.out.println("Singleton: NEW");
            instance = new Singleton();
        }
        return instance;
    }  
}