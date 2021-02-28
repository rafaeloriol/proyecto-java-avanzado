package com.rafaeloriol.proyecto.domain;

public class Bateria {

    private int capacidadBateria;

    public Bateria(int capacidad) {
        this.capacidadBateria = capacidad;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }
    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public void on() {
        System.out.println("Battery ON");
    }
    public void off() {
        System.out.println("Battery OFF");
    }
}
