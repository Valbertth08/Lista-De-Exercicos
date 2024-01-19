package Collections.LinkedList;

import java.util.LinkedList;

public class Ex9 {
    //Escreva um programa Java para inserir alguns elementos na posição especificada em uma lista vinculada.

    public static void main(String[] args) {
        LinkedList<String> nomes1= new LinkedList<>();
        nomes1.add("Carlos");
        nomes1.add("Andre");
        nomes1.add("raimundo");

        LinkedList<String> nomes2= new LinkedList<>();
        nomes2.add("leticia");
        nomes2.add("fabiola");
        nomes2.add("andreia");

        nomes1.addAll(2,nomes2);//estou adicionando a lista nomes2 na posição 2 de nomes1,
        // entretando a lista "toda" de nomes2 não vai ficar somente na posição 2, eles vão ser distriuidos
        System.out.println(nomes1);

    }

}
