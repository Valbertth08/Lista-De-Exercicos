package Collections.Map;

import java.util.TreeMap;

public class Ex19 {

    //Escreva um programa Java para excluir todos os elementos de um mapa de árvore.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);

        produto.clear();
        System.out.println(produto);
    }
}
