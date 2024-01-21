package Collections.Set;

import java.util.TreeSet;

public class Ex24 {
    //Escreva um programa Java para obter o elemento em um conjunto de árvore estritamente maior ou igual ao elemento fornecido.

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(49);
        numeros.add(21);
        numeros.add(22);
        System.out.println(numeros.higher(40));//retorna o menor elemento que é estritamente maior que o especificado, ou seja, basicamente seu sucessor.
    }

}
