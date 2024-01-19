package Collections.ArrayList;

import java.util.ArrayList;

public class Ex5 {

    //Escreva um programa Java para recuperar
    //um elemento (em um índice especificado) de uma determinada lista de arrays.
    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");
        System.out.println(nomes.get(2));
    }

}
