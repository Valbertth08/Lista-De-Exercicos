package Collections.LinkedList;

import java.util.LinkedList;

public class Ex14 {
   // Escreva um programa Java para remover todos os elementos de uma lista vinculada.
   public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        //nomes.removeAll(nomes);//passando ele mesmo como parametro
        nomes.clear();
        System.out.println(nomes);
    }
}
