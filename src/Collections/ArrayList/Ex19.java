package Collections.ArrayList;

import java.util.ArrayList;

public class Ex19 {

    // Escreva um programa Java para reduzir a capacidade de uma lista de arrays.
    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        System.out.println(nomes1.size());
        nomes1.trimToSize();//Esse metodo corta a lista para o seu tamanho real, ocupando somente seu tamanho de acordo com sua contidade de valores
        System.out.println(nomes1.size());

        
    }

}
