package Collections.Map;

import java.util.TreeMap;

public class Ex26 {
    //Escreva um programa Java para obter a parte de um mapa cujas chaves são estritamente menores que uma determinada chave.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println( produto.headMap("G"));//pega todos os valores que são menores que ele

    }
}
