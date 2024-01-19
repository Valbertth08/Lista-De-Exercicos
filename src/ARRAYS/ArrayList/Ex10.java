package ARRAYS.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex10 {
    // Escreva um programa Java para embaralhar elementos em uma lista de array.

    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");
        Collections.shuffle(nomes);//embaralha os elementos

    }

}
