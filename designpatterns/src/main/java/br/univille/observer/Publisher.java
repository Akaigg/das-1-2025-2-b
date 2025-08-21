package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(this);
        }
    }

    public void mainBusinessLogic(String newState) {
        this.mainState = newState;
        notifySubscribers();
    }

    public String getMainState() {
        return mainState;
    }
}
