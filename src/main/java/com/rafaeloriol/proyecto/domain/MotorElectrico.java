package com.rafaeloriol.proyecto.domain;

public class MotorElectrico extends Motor{

    private int cilindrosMotor;

    public MotorElectrico(int cilindrosMotor) {
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
        System.out.println("Motor Electrico ON");
    }
    @Override
    public void off() {
        System.out.println("Motor Electrico OFF");
    }
}
