package Generics;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    //Escreva um programa Java para criar um método genérico
    //que pegue uma lista de números e retorne a soma de todos os números pares e ímpar

    public static void main(String[] args) {
        List<Double> numeros = Arrays.asList(4.0,8.0,6.0);
        soma(numeros);
    }

    public static <T extends Number> void soma (List<T> lista){
        int par=0;
        int impar=0;

        for (Number valor: lista) {
            if (valor.intValue()%2==0){
                par+=valor.intValue();
            }
            else {
                impar+=valor.intValue();
            }
        }
        System.out.println("Soma dos numeros pares: "+par);
        System.out.println("Soma dos numeros impares: "+impar);
    }

}
