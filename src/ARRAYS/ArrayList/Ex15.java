package ARRAYS.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex15 {
    // Escreva um programa Java que troque dois elementos em uma lista de arrays.

    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
       Collections.swap(nomes1,2,0);//Com o a função swap eu troco os elementos da lista
        //o primeiro parametro é a lista o segundo é o elemento a ser trocado e o terceiro é o outro elemento a ser trocado
        for(String a: nomes1){
            System.out.println(a);
        }
    }

}
