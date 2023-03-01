package com.company.leccion1.definiciones.tryAndCatch.throwYThrows;

public class NameFormatException extends Exception{
    private static final long serialVersionUID = 1L;

    public NameFormatException(String errorMessage){
        super(errorMessage);
    }
}
