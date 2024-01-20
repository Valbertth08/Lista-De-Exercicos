package Collections.Set;

import java.util.HashSet;

public class Ex3 {
    //Escreva um programa Java para obter o número de elementos em um conjunto hash.

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");

        System.out.println(nomes.size());
    }
}
