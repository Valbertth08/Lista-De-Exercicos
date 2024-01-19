package Collections.ArrayList;

import java.util.ArrayList;

public class Ex8 {
    //Escreva um programa Java para procurar um elemento em uma lista de arrays.
    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");
        nomes.set(2,"Carla");

       System.out.println(nomes.contains("Raimundo"));
    }


}
