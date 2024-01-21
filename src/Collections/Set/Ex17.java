package Collections.Set;

import java.util.TreeSet;

public class Ex17 {
//Escreva um programa Java para obter o primeiro e o último elemento de um conjunto de árvore
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");

        System.out.println(cores.first());
        System.out.println(cores.last());
    }
}
