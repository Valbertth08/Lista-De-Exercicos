package Collections.Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Ex20 {
    //Escreva um programa Java para classificar chaves em um mapa de árvore usando um comparador.

    public static void main(String[] args) {
        Comparator<String> comp = (p,t)-> p.toUpperCase().compareTo(t.toUpperCase());
        TreeMap<String,Double> produto= new TreeMap<>(comp);
        produto.put("Tv",2000.0);
        produto.put("monitor",400.0);
        produto.put("aouse",120.0);
        System.out.println(produto);


    }
}
