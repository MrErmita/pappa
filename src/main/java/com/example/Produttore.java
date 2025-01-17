package com.example;

class Produttore implements Runnable {
    private final Piatto piatto;

    public Produttore(Piatto piatto) {
        this.piatto = piatto;
    }

    @Override
    public void run() {
        int bocconeId = 1;
        try {
            while (true) {
                piatto.aggiungiBoccone("Boccone " + bocconeId);
                bocconeId++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
