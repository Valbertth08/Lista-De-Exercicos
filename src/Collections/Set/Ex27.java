package Collections.Set;

import java.util.TreeSet;

public class Ex27 {
//Escreva um programa Java para remover um determinado elemento de um conjunto de árvore.

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(49);
        numeros.add(21);
        numeros.add(22);
        numeros.remove(21);
        System.out.println(numeros);
    }
}
