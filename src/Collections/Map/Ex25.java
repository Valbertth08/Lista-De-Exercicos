package Collections.Map;

import java.util.TreeMap;

public class Ex25 {
//Escreva um programa Java para obter a maior chave menor ou igual à chave fornecida.
    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

       System.out.println( produto.floorKey("D"));

    }

}
