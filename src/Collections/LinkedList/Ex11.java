package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex11 {
    //Escreva um programa Java para exibir elementos e suas posições em uma lista vinculada
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        for (int i =0; i<nomes.size();i++){
            System.out.println("Nome: "+nomes.get(i)+ " Posição: "+(i+1));
        }

    }
}
