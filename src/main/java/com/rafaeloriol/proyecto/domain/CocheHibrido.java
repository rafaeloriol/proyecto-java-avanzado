package com.rafaeloriol.proyecto.domain;

public class CocheHibrido extends Coche {

    private MotorHibrido hibrido;
    private Bateria bateria;
    private AireAcondionado aireacondicionado;
    private Inyeccion inyeccion;

    public CocheHibrido(){}

    public CocheHibrido(MotorHibrido hibrido, Bateria bateria, AireAcondionado aireacondicionado, Inyeccion inyeccion) {
        this.hibrido = hibrido;
        this.bateria = bateria;
        this.aireacondicionado = aireacondicionado;
        this.inyeccion = inyeccion;
    }

    public MotorHibrido getHibrido() {
        return hibrido;
    }

    public void setHibrido(MotorHibrido hibrido) {
        this.hibrido = hibrido;
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
        return "CocheHibrido{" +
                "hibrido=" + hibrido +
                ", bateria=" + bateria +
                ", aireacondicionado=" + aireacondicionado +
                ", inyeccion=" + inyeccion +
                '}';
    }

    public static CocheHibrido start() {
        Bateria bateria = new Bateria(90);
        bateria.on();
        MotorHibrido hibrido = new MotorHibrido(8);
        hibrido.on();
        AireAcondionado aireacondicionado = new AireAcondionado("tipo coche híbrido");
        aireacondicionado.on();
        Inyeccion inyeccion = new Inyeccion("tipo coche híbrido");

        return new CocheHibrido(hibrido, bateria, aireacondicionado, inyeccion);
    }

}
