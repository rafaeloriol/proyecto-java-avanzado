package com.rafaeloriol.proyecto.domain;


public class CocheElectrico extends Coche {

    private MotorElectrico electrico;
    private Bateria bateria;
    private AireAcondionado aireacondicionado;
    private Inyeccion inyeccion;

    //public CocheElectrico(){};
    public CocheElectrico(MotorElectrico electrico, Bateria bateria, AireAcondionado aireacondicionado, Inyeccion inyeccion) {
        this.electrico = electrico;
        this.bateria = bateria;
        this.aireacondicionado = aireacondicionado;
        this.inyeccion = inyeccion;
    }

    public MotorElectrico getElectrico() {
        return electrico;
    }

    public void setElectrico(MotorElectrico electrico) {
        this.electrico = electrico;
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
        return "CocheElectrico{" +
                "electrico=" + electrico +
                ", bateria=" + bateria +
                ", aireacondicionado=" + aireacondicionado +
                ", inyeccion=" + inyeccion +
                '}';
    }

    public static CocheElectrico start() {
        Bateria bateria = new Bateria();
        bateria.on();
        MotorElectrico electrico = new MotorElectrico();
        electrico.on();
        AireAcondionado aireacondicionado = new AireAcondionado();
        aireacondicionado.on();
        Inyeccion inyeccion = new Inyeccion();

        return new CocheElectrico(electrico, bateria, aireacondicionado, inyeccion);

    }
}
