package com.rafaeloriol.proyecto.domain;

public class MotorCombustion extends Motor{

    @Override
    public void on() {
        System.out.println("Motor de Combustión ON");
    }

    @Override
    public void off() {
        System.out.println("Motor de Combustión OFF");
    }
}
