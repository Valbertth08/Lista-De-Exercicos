package Collections.LinkedList;

import java.util.LinkedList;

public class Ex5 {
    //Escreva um programa Java para inserir o elemento especificado na posição especificada na lista vinculada.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        nomes.add(2,"jose");
        System.out.println(nomes);
    }
}
