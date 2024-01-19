package Collections.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex4 {
    //Escreva um programa Java para iterar uma lista vinculada na ordem inversa.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");

        Iterator lista= nomes.descendingIterator();

        while (lista.hasNext()){
            System.out.println(lista.next());
        }
    }
}
