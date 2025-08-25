package br.univille.observer;


import java.util.ArrayList;

public class Publisher {
   //private Subscriber[] subscriber =new Subscriber[10]; --> limite de 10 posiçôes
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
}