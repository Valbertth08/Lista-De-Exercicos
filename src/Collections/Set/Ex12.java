package Collections.Set;

import java.util.HashSet;

public class Ex12 {
    // Escreva um programa Java para remover todos os elementos de um conjunto hash.
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(4);
        num.add(12);
        num.add(5);
        num.add(8);
        num.add(3);
        num.clear();
        System.out.println( num);
    }
}
