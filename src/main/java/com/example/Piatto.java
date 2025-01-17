package com.example;

import java.util.LinkedList;

class Piatto {
    private final LinkedList<String> bocconi = new LinkedList<>();
    private final int CAPACITA = 10;

    public synchronized void aggiungiBoccone(String boccone) throws InterruptedException {
        while (bocconi.size() == CAPACITA) {
            wait();
        }
        bocconi.add(boccone);
        System.out.println("Produttore ha aggiunto: " + boccone);
        notify();
    }

    public synchronized String consumaBoccone() throws InterruptedException {
        while (bocconi.isEmpty()) {
            wait();
        }
        String boccone = bocconi.removeFirst();
        System.out.println("Consumatore ha consumato: " + boccone);
        notify();
        return boccone;
    }
}
