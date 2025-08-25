package br.univille.observer;

public class ConcreteSubscriber
    implements Subscriber {


    public void update(String context) {
        System.out.println(context);
    }

    @Override
    public void update(Publisher context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}