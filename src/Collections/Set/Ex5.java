package Collections.Set;

import java.util.HashSet;

public class Ex5 {
//Escreva um programa Java para testar se um conjunto de hash está vazio ou não.
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");
        System.out.println(nomes.isEmpty());
    }

}
