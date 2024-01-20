package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {
//Escreva um programa Java para iterar todos os elementos de uma lista hash.
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");

        Iterator<String> list= nomes.iterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }
}
