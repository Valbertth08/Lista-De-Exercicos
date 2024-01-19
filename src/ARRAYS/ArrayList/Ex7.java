package ARRAYS.ArrayList;

import java.util.ArrayList;

public class Ex7 {
    //Escreva um programa Java para remover o terceiro elemento de uma lista de arrays.

    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");
        nomes.set(2,"Carla");

        nomes.remove(3);
        System.out.println(nomes);
    }


}
