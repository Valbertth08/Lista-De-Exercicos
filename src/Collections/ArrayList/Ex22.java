package Collections.ArrayList;

import java.util.ArrayList;

public class Ex22 {
   // Escreva um programa Java para imprimir todos os
    //elementos de um ArrayList usando a posição dos elementos.

    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");

        for (int i=0; i<nomes1.size();i++){
            System.out.println(nomes1.get(i));
        }
    }

}
