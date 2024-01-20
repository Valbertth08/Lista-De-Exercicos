package Collections.Set;

import java.util.HashSet;

public class Ex4 {
    //Escreva um programa Java para esvaziar um conjunto de hash.
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.clear();
        System.out.println(nomes);
    }
}
