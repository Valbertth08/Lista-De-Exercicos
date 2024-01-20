package Collections.Set;

import java.util.HashSet;

public class Ex1 {
//Escreva um programa Java para anexar o elemento especificado ao final de um conjunto de hash.

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");
        System.out.println(nomes);
    }
}
