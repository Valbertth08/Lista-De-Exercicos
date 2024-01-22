package Collections.Map;

import java.util.TreeMap;

public class Ex27 {
    // Escreva um programa Java para obter a parte deste mapa cujas chaves são menores (ou iguais, se inclusivo for verdadeiro) a uma determinada chave.
    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

      System.out.println(produto.headMap("E",true));// sera feito um recorte no mapa com os menores valores que o especificado e o parametro true
        //indica que o valor especificado também entrara no recorte
    }
}
