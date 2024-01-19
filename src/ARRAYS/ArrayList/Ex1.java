package ARRAYS.ArrayList;

import java.util.ArrayList;

public class Ex1 {

    //Escreva um programa Java para unir duas listas de arrays.
    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        ArrayList<String> nomes2= new ArrayList<>();
        nomes2.add("Matheus");
        nomes2.add("Luiza");
        nomes2.add("Pedro");

        nomes1.addAll(nomes2);

        System.out.println(nomes1);
    }
}


