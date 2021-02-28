package com.rafaeloriol.proyecto.domain;

import com.rafaeloriol.proyecto.error.NoCarFoundException;

public class FactoryCoche {

    public static Coche crearCoche(String tipo) throws NoCarFoundException {

        switch (tipo) {
            case "combustion":
                return CocheCombustion.start();
            case "electrico":
                return CocheElectrico.start();
            case "hibrido":
                return CocheHibrido.start();
            default:
                throw new NoCarFoundException("COCHE NO VÁLIDO");
        }

    }

}
