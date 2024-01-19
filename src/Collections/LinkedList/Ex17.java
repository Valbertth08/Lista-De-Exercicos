package Collections.LinkedList;

import java.util.LinkedList;

public class Ex17 {
//Escreva um programa Java para unir duas listas vinculadas.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        LinkedList<String> nomes2= new LinkedList<>();
        nomes2.add("leticia");
        nomes2.add("fabiola");
        nomes2.add("andreia");
        nomes.addAll(nomes2);
        System.out.println(nomes);
    }


}
