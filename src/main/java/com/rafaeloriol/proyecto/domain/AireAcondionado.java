package com.rafaeloriol.proyecto.domain;

public class AireAcondionado {

    private String tipoAire;

    public AireAcondionado(String tipoAire) {
        this.tipoAire = tipoAire;
    }

    public String getTipoAire() {
        return tipoAire;
    }
    public void setTipoAire(String tipoAire) {
        this.tipoAire = tipoAire;
    }

    public void on() {
        System.out.println("Aire Acondicionado ON");
    }
    public void off() {
        System.out.println("Aire Acondicionado OFF");
    }
}
