package Collections.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ex23 {
    //Escreva um programa Java para converter uma lista vinculada em uma lista de array.

    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        ArrayList<String> list= new ArrayList<>(nomes);
        System.out.println(list);
    }
}
