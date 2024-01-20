package Collections.Set;

import java.util.HashSet;

public class Ex11 {
//Escreva um programa Java para comparar dois conjuntos e reter elementos iguais.
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(4);
        num.add(12);
        num.add(5);
        num.add(8);
        num.add(3);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(4);
        num2.add(12);
        num2.add(5);
        num2.add(11);
        num2.add(22);

        num.retainAll(num2);
        System.out.println(num);
    }
}
