package ARRAYS.ArrayList;

import java.util.ArrayList;

public class Ex13 {
    //Escreva um programa Java para extrair uma parte de uma lista de arrays.
    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");
        nomes.add("Matheus");
        nomes.add("Luiza");
        nomes.add("Pedro");
        ArrayList<String> nomes2= (ArrayList<String>) nomes.subList(0,2);//ele não considera a contagem partindo do 0.
        //A subclasse é criada sem alterar a principal.
        System.out.println(nomes2);
       // System.out.println(nomes2);
    }

}
