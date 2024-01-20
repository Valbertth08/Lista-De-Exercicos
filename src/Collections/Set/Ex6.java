package Collections.Set;

import java.util.HashSet;

public class Ex6 {

    //Escreva um programa Java para clonar um conjunto de hash para outro conjunto de hash.
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");
        HashSet<String> nomes2 = (HashSet)nomes.clone();

        System.out.println(nomes2);

    }
}
