package Collections.ArrayList;

import java.util.ArrayList;

public class Ex14 {
    //Escreva um programa Java para comparar duas listas de arrays.

    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        ArrayList<String> nomes2= new ArrayList<>();
        nomes2.add("Matheus");
        nomes2.add("Luiza");
        nomes2.add("Pedro");

        ArrayList<String> nomes3 = new ArrayList<>();
        for (String e : nomes1)
            nomes3.add(nomes2.contains(e) ? "Yes" : "No");//utilizando um operador ternario
        System.out.println(nomes3);
    }

}
