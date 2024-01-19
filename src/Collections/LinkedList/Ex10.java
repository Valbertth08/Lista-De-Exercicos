package Collections.LinkedList;

import java.util.LinkedList;

public class Ex10 {
    //Escreva um programa Java para obter a primeira e a última ocorrência dos elementos especificados em uma lista vinculada.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");

       System.out.println(nomes.getFirst());//pegando o primeiro elemento da lista
       System.out.println(nomes.getLast());//pegando o ultimo elemento da lista
    }
}
