package Collections.Set;

import java.util.TreeSet;

public class Ex26 {
    //Escreva um programa Java para recuperar e remover o último elemento de um conjunto de árvores.
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(49);
        numeros.add(21);
        numeros.add(22);
        System.out.println(numeros.pollLast());
    }
}
