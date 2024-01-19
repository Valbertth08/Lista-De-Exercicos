package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex9 {
//Escreva um programa Java para classificar uma determinada lista de arrays.
    public static void main(String[] args) {

        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");

        Collections.sort(nomes);
        System.out.println(nomes);
    }
}
