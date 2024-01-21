package Collections.Set;

import java.util.TreeSet;

public class Ex15 {
    public static void main(String[] args) {
        // Escreva um programa Java para adicionar todos os elementos de um conjunto de árvores especificado a outro conjunto de árvores.
        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");

        TreeSet<String> cores2 = new TreeSet<>();
        cores.add("Preto");
        cores.add("Roxo");
        cores.add("Amarelo");
        cores.addAll(cores2);
        System.out.println(cores);
    }
}
