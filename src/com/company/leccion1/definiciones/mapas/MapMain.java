package com.company.leccion1.definiciones.mapas;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();

        personas.put("138379H", "Nombre Aellido 1");
        personas.put("138379L", "Nombre Aellido 2");
        personas.put("138379P", "Nombre Aellido 3");

        System.out.println(personas);

        for(String key : personas.keySet()){//me devuelve las key id unico
            System.out.println(key);
        }
        for(String value : personas.values()){//me devuelve los valores
            System.out.println(value);
        }
        for(Map.Entry<String, String> pair : personas.entrySet()){//nos da un objeto que nos da ambos
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}



