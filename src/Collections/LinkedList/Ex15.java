package Collections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Ex15 {
    //Escreva um programa Java que troque dois elementos em uma lista vinculada.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        Collections.swap(nomes,0,2);//trocando os elementos de lugares
        System.out.println(nomes);
    }
}
