package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Ex8 {
    //Escreva um programa Java para converter um conjunto hash em um conjunto de árvore.
    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");
        TreeSet list= new TreeSet<>(nomes);

        System.out.println(list);
    }
}
