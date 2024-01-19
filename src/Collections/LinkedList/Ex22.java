package Collections.LinkedList;

import java.util.LinkedList;

public class Ex22 {
    //Escreva um programa Java para verificar se um elemento específico existe em uma lista vinculada.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");

        System.out.println( nomes.contains("Andre"));
    }
}
