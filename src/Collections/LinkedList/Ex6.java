package Collections.LinkedList;

import java.util.LinkedList;

public class Ex6 {
   // Escreva um programa Java para inserir elementos na lista vinculada na primeira e na última posição.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        nomes.addFirst("Lucas");
        nomes.addLast("Fernanda");

        System.out.println(nomes);
    }

}
