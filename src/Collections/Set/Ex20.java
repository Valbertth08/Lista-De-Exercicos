package Collections.Set;

import java.util.TreeSet;

public class Ex20 {
    // Escreva um programa Java para comparar dois conjuntos de árvores.

    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");

        TreeSet<String> cores2 = new TreeSet<>();
        cores2.add("Preto");
        cores2.add("Roxo");
        cores2.add("Laranja");
        for (String i: cores){
            System.out.println(cores2.contains(i));
        }

    }

}
