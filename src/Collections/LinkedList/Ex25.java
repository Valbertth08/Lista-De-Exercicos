package Collections.LinkedList;

import java.util.LinkedList;

public class Ex25 {
    //Escreva um programa Java para verificar se uma lista vinculada está vazia ou não.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        System.out.println(nomes.isEmpty());
    }
}
