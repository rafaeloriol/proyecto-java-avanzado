package com.rafaeloriol.proyecto.domain;

public class CocheCombustion extends Coche {

private MotorCombustion combustion;
private Bateria bateria;
private AireAcondionado aireacondicionado;
private Inyeccion inyeccion;

 public CocheCombustion(){}
    public CocheCombustion(MotorCombustion combustion, Bateria bateria, AireAcondionado aireacondicionado, Inyeccion inyeccion) {
        this.combustion = combustion;
        this.bateria = bateria;
        this.aireacondicionado = aireacondicionado;
        this.inyeccion = inyeccion;
    }

    public MotorCombustion getCombustion() {
        return combustion;
    }

    public void setCombustion(MotorCombustion combustion) {
        this.combustion = combustion;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public AireAcondionado getAireacondicionado() {
        return aireacondicionado;
    }

    public void setAireacondicionado(AireAcondionado aireacondicionado) {
        this.aireacondicionado = aireacondicionado;
    }

    public Inyeccion getInyeccion() {
        return inyeccion;
    }

    public void setInyeccion(Inyeccion inyeccion) {
        this.inyeccion = inyeccion;
    }

    @Override
    public String toString() {
        return "CocheCombustion{" +
                "combustion=" + combustion +
                ", bateria=" + bateria +
                ", aireacondicionado=" + aireacondicionado +
                ", inyeccion=" + inyeccion +
                '}';
    }


    public static CocheCombustion start() {
        Bateria bateria = new Bateria(50);
        bateria.on();
        MotorCombustion combustion = new MotorCombustion(5);
        combustion.on();
        AireAcondionado aireacondicionado = new AireAcondionado("tipo coche combustion");
        aireacondicionado.on();
        Inyeccion inyeccion = new Inyeccion("tipo coche combustion");

        return new CocheCombustion(combustion, bateria, aireacondicionado, inyeccion);

    }
}
