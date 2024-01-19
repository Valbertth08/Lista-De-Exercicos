package Collections.LinkedList;

import java.util.LinkedList;

public class Ex7 {
    //Escreva um programa Java para inserir o elemento especificado no início de uma lista vinculada.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");

        nomes.offerFirst("Amanda");//retorna um bollean, e é mais voltado para saber se a inserção foi bem sucedida
        System.out.println(nomes);
    }

}
