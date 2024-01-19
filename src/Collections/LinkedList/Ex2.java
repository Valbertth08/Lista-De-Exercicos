package Collections.LinkedList;

import java.util.LinkedList;

//Escreva um programa Java para iterar todos os elementos de uma lista vinculada.
public class Ex2 {
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");

        for (String e: nomes){
            System.out.println(e);
        }

    }

}
