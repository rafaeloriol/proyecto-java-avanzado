package com.rafaeloriol.proyecto.domain;

public class MotorElectrico extends Motor{

    @Override
    public void on() {
        System.out.println("Motor Electrico ON");
    }

    @Override
    public void off() {
        System.out.println("Motor Electrico OFF");
    }
}
