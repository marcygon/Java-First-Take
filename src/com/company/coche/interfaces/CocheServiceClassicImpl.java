package com.company.coche.interfaces;

import com.company.coche.Coche;
import com.company.coche.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Se ha creado un coche clasico");
        return new CocheElectrico("blanco","corvette","buffalo",1600.30, 5.20,"engine");
    }
}
