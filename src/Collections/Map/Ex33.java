package Collections.Map;

import java.util.TreeMap;

public class Ex33 {
    //Escreva um programa Java para remover e obter um mapeamento de valor-chave associado à maior chave neste mapa.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println(produto.pollLastEntry());
    }
}
