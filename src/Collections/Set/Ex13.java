package Collections.Set;

import java.util.TreeSet;

public class Ex13 {
    // Escreva um programa Java para criar um conjunto de árvores, adicione algumas cores (strings) e imprima o conjunto de árvores.
    public static void main(String[] args) {

        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");
        System.out.println(cores);
    }
}
