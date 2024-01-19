package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex3 {
    //Escreva um programa Java para iterar todos os elementos em uma lista vinculada começando na posição especificada.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");

       Iterator lista= nomes.listIterator(1);//retorna uma iterator
        while(lista.hasNext()){//verifica se tem um proximo valor
            System.out.println(lista.next());//printa esse proximo valor
        }
    }
}
