package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        int age = 17;
        String MyString1 =  "Hola";
        String MyString2 =  "Holas";



        //assert age >= 18: "undeer"; //Hay que deshabilitarlos porque una vez que entra al preimer assert ya no sigue las demas lineas
        //assert  1 > 5: "Un minuto no menos 5 minutos";
        assert MyString1.equals(MyString2): "No Hola"; //assert 2 strings con == compara direcciones de memoria no los valores internos

        // integer compared againts string need to cast
        // ranks Mynum>=10 && Mynum<=20

    }
}



