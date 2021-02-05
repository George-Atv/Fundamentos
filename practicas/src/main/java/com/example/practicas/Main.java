package com.example.practicas;

public class Main {
    public static void main (String[] args) {
        final short enteroCorto = 120; //32767;
        int enteroNormal = 3023;
        long enteroLargo;
        float decimalCorto = 24.45f;
        double decimalLargo = 23.353534543;
        char caracter = 'a';
        boolean esValido =true;

        enteroNormal = 4 * 8 ;
        enteroLargo = 239472343872L;

        System.out.println(enteroCorto) ;
        System.out.println(enteroNormal) ;
        System.out.println(enteroLargo) ;
        System.out.println(decimalCorto) ;
        System.out.println(decimalLargo) ;
        System.out.println(caracter) ;
        System.out.println(esValido) ;

        String[] nombres = new String[]{"Jorge", "Ines", "Carlitos", "Pajarita"};

        System.out.println() ;
        System.out.println("Arreglos") ;
        System.out.println(nombres[0]) ;
        System.out.println(nombres[1]) ;
        System.out.println(nombres[2]) ;
        System.out.println(nombres[3]) ;
    }
}