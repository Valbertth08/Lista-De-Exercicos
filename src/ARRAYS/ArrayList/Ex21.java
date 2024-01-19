package ARRAYS.ArrayList;

import java.util.ArrayList;

public class Ex21 {
    //Escreva um programa Java para substituir o segundo elemento de um ArrayList pelo elemento especificado.
    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        nomes1.set(1,"Roxa");
        System.out.println(nomes1);
    }




}
