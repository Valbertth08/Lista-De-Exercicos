package Collections.Map;

import java.util.TreeMap;

public class Ex16 {
    //Escreva um programa Java para procurar uma chave em um mapa de árvore.]

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);


        System.out.println(produto.containsKey("Mouse"));
    }
}
