package Collections.LinkedList;

import java.util.LinkedList;

public class Ex13 {
   // Escreva um programa Java para remover o primeiro e o último elemento de uma lista vinculada.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        nomes.removeFirst();
        nomes.removeLast();

        System.out.println(nomes);
    }
}
