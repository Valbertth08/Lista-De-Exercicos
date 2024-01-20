package Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Ex7 {
    //Escreva um programa Java para converter um conjunto hash em um array.

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");
        ArrayList list= new ArrayList<>(nomes);

        System.out.println(list);
    }
}
