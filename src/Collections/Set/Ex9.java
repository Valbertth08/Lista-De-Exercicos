package Collections.Set;

import java.util.HashSet;

public class Ex9 {
    // Escreva um programa Java para encontrar números menores que 7 em um conjunto de árvore.
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(4);
        num.add(12);
        num.add(5);
        num.add(8);
        num.add(3);
        for (Integer i: num){
            if( i< 7){
                System.out.println(i);
            }
        }

    }
}
