package com.rafaeloriol.proyecto.domain;

public class MotorHibrido extends Motor{

    @Override
    public void on() {
        System.out.println("Motor Híbrido ON");
    }

    @Override
    public void off() {
        System.out.println("Motor Híbrido OFF");
    }

}
