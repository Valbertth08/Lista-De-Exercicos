package Collections.LinkedList;

import java.util.LinkedList;

public class Ex24 {
    //Escreva um programa Java para comparar duas listas vinculadas.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        LinkedList<String> nomes2= new LinkedList<>();
        nomes2.add("leticia");
        nomes2.add("fabiola");
        nomes2.add("andreia");
        LinkedList<String> nomes3= new LinkedList<>();
        for (String e: nomes){
            nomes3.add(nomes2.contains(e)? "Yes":"No");
        }
        System.out.println(nomes3);
    }
}
