package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();

        var Marlonos = new ConcreteSubscriber();
        var Allan = new ConcreteSubscriber();
        var tia = new ConcreteSubscriber();

        grupoFamilia.subscribe(Marlonos);
        grupoFamilia.subscribe(Allan);
        grupoFamilia.subscribe(tia);

        grupoFamilia.setMainState("gore");
        grupoFamilia.notifySubscribers();

    }
}