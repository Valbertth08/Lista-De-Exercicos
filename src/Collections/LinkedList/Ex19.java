package Collections.LinkedList;

import java.util.LinkedList;

public class Ex19 {
    //Escreva um programa Java para remover e retornar o primeiro elemento de uma lista vinculada.
    public static void main(String[] args) {
        String valor;
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
       valor= nomes.pop();//remove o primeiro elemento da lista
       System.out.println("lista: "+nomes);
       System.out.println("Elemento removido: "+valor);



    }
}
