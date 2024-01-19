package ARRAYS.ArrayList;

import java.util.ArrayList;

public class Ex3 {
    //Escreva um programa Java para iterar todos os elementos de uma lista de array.
    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");
        for (String nome: nomes){
            System.out.print(nome);
        }
    }




}
