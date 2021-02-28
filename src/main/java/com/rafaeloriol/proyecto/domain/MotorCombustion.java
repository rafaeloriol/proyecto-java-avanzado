package com.rafaeloriol.proyecto.domain;

public class MotorCombustion extends Motor{

    private int cilindrosMotor;

    public MotorCombustion(int cilindros) {
        this.cilindrosMotor = cilindros;
    }

    public int getCilindrosMotor() {
        return cilindrosMotor;
    }
    public void setCilindrosMotor(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    @Override
    public void on() {
        System.out.println("Motor de Combustión ON");
    }
    @Override
    public void off() {
        System.out.println("Motor de Combustión OFF");
    }
}
