package Collections.Map;

import java.util.TreeMap;

public class Ex23 {

    //Escreva um programa Java para obter uma visão em ordem inversa das chaves contidas em um determinado mapa.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);

        System.out.println(produto.descendingKeySet());//pegando as chaves na ordem inversa


    }
}
