package com.rafaeloriol.proyecto.domain;

public class FactoryCoche {

    public static Coche crearCoche(String tipo) throws Exception {

        switch (tipo) {
            case "combustion":
                return CocheCombustion.start();
            case "electrico":
                return CocheElectrico.start();
            case "hibrido":
                return CocheHibrido.start();
            default:
                throw new Exception("Coche inválido");
        }

    }

}
