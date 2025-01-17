package com.example;

class Consumatore implements Runnable {
    private final Piatto piatto;

    public Consumatore(Piatto piatto) {
        this.piatto = piatto;
    }

    @Override
    public void run() {
        try {
            while (true) {
                piatto.consumaBoccone();
                Thread.sleep(1000); // Simula il tempo di consumo
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
