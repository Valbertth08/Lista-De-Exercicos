package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex12 {
    //Escreva um programa Java para reverter elementos em uma lista de arrays.
    public static void main(String[] args) {
        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        Collections.reverse(nomes1);
        System.out.println(nomes1);
    }

}
