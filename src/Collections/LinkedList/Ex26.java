package Collections.LinkedList;

import java.util.LinkedList;

public class Ex26 {
    //Escreva um programa Java para substituir um elemento em uma lista vinculada.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        nomes.set(2,"antorio");
        System.out.println(nomes);


    }

}
