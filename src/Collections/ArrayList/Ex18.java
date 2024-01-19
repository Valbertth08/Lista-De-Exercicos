package Collections.ArrayList;

import java.util.ArrayList;

public class Ex18 {
    //Escreva um programa Java para testar se uma lista de arrays está vazia ou não.
    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");

        if(nomes1.isEmpty()){
            System.out.println("Lista vazia");
        }
        else {
            System.out.println("Contem valores");
        }
    }

}
