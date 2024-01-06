package GENERICS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    //Escreva um programa Java para criar um método genérico que pegue uma lista de qualquer tipo
    //e a retorne como uma nova lista com os elementos na ordem inversa

    public static void main(String[] args) {
        List<Integer> lista= Arrays.asList(3,4,6,20);
        System.out.println(inverter(lista));
    }
    public static <T> List<T> inverter(List<T> lista) {
        List<T> listaInversa = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInversa.add(lista.get(i));
        }
        return listaInversa;
    }

}
