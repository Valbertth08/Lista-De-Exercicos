package Collections.ArrayList;

import java.util.ArrayList;

public class Ex6 {
    //Escreva um programa Java para atualizar um elemento do array pelo elemento fornecido.
    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Roberto");
        nomes.add("Raimundo");
        nomes.add("Mariana");
        nomes.set(2,"Carla");

        System.out.println(nomes);
    }

}
