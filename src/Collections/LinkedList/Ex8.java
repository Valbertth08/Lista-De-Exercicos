package Collections.LinkedList;

import java.util.LinkedList;

public class Ex8 {
    //Escreva um programa Java para inserir o elemento especificado no final de uma lista vinculada.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        nomes.offerLast("Pedro");
        System.out.println(nomes);

    }
}
