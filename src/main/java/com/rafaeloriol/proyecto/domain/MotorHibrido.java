package com.rafaeloriol.proyecto.domain;

public class MotorHibrido extends Motor{

    private int cilindrosMotor;

    public MotorHibrido(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    public int getCilindrosMotor() {
        return cilindrosMotor;
    }
    public void setCilindrosMotor(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    @Override
    public void on() {
        System.out.println("Motor Híbrido ON");
    }

    @Override
    public void off() {
        System.out.println("Motor Híbrido OFF");
    }

}
