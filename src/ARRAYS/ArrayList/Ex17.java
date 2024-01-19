package ARRAYS.ArrayList;

import java.util.ArrayList;

public class Ex17 {
    //Escreva um programa Java para esvaziar uma lista de arrays.

    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        nomes1.removeAll(nomes1);//removo todos os elementos com base em uma lista, que nesse exemplo foi ela mesma
        System.out.println(nomes1);
    }

}
