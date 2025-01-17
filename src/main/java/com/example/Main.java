package com.example;



public class Main {
    public static void main(String[] args) {
        Piatto piatto = new Piatto();
        Produttore produttore = new Produttore(piatto);
        Consumatore consumatore = new Consumatore(piatto);

        Thread threadProduttore = new Thread(produttore);
        Thread threadConsumatore = new Thread(consumatore);

        threadProduttore.start();
        threadConsumatore.start();
    }
}
