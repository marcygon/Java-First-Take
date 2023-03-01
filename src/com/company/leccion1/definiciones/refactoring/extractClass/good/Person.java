package com.company.leccion1.definiciones.refactoring.extractClass.good;

/**
 * Tecnica de refactoring para distribuir funcionalidad entre objetos
 * (Moving features between Objects)
 *
 * Extract class
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Adress adress; //cardinalidad? puede ser cualquiera
}
