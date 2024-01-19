package Collections.LinkedList;

import java.util.LinkedList;

public class Ex12 {
    //Escreva um programa Java para remover um elemento especificado de uma lista vinculada.
    public static void main(String[] args) {

        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        nomes.remove(1);
        System.out.println(nomes);
    }
}
