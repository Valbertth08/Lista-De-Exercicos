package Collections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Ex16 {
    //Escreva um programa Java para embaralhar elementos em uma lista vinculada.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        Collections.shuffle(nomes);//função que embaralha os elementos

        System.out.println(nomes);
    }

}
