package Collections.Map;

import java.util.TreeMap;

public class Ex18 {
  //  Escreva um programa Java para obter todas as chaves de um mapa de árvore.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        System.out.println(produto.keySet());
    }
}
