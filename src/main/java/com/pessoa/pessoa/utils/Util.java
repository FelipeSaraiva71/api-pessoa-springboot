package com.pessoa.pessoa.utils;

public class Util {

    public static String validaNome(String nome){

        if (nome == null || nome.trim().isEmpty() || !nome.matches("[\\p{L} -]+")){
            throw new IllegalArgumentException("Entrada inválida.");
        }
return nome;
    }
}
