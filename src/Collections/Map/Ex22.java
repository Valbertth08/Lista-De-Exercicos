package Collections.Map;

import java.util.TreeMap;

public class Ex22 {
    public static void main(String[] args) {
        //Escreva um programa Java para obter a primeira chave (mais baixa) e a última chave (mais alta) atualmente em um mapa.

        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);

        System.out.println("Maior-----Chave: "+produto.firstKey()+" Valor: "+produto.firstEntry());
        System.out.println("Menor-----Chave: "+produto.lastKey()+" Valor: "+produto.get(produto.lastKey()));

    }
}
