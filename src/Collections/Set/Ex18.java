package Collections.Set;

import java.util.TreeSet;

public class Ex18 {
//Escreva um programa Java para clonar uma lista de conjuntos de árvores para outro conjunto de árvores.
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");

        TreeSet<String> cores2 = (TreeSet<String>) cores.clone();

        System.out.println(cores2);


    }
}
