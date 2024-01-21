package Collections.Set;

import java.util.TreeSet;

public class Ex19 {
    //Escreva um programa Java para obter o número de elementos em um conjunto de árvore.
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");

        System.out.println(cores.size());
    }
}
