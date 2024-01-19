package ARRAYS.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11 {
    //Escreva um programa Java para copiar uma lista de arrays para outra.
    public static void main(String[] args) {

        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        ArrayList<String> nomes2= new ArrayList<>();
        nomes2.add("Matheus");
        nomes2.add("Luiza");
        nomes2.add("Pedro");
        Collections.copy(nomes2,nomes1);//primeiro parametro(quem copia) e segundo (quem é copiado).
        System.out.println(nomes2);
    }


}
