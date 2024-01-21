package Collections.Set;

import java.util.TreeSet;

public class Ex25 {
    //Escreva um programa Java para recuperar e remover o primeiro elemento de um conjunto de árvores.
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(49);
        numeros.add(21);
        numeros.add(22);
       System.out.println(numeros.pollFirst());;//essa função retorna e remove o primeiro elemento da lista
    }
}
