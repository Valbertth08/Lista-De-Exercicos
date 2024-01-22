package Collections.Map;

import java.util.TreeMap;

public class Ex39 {
    public static void main(String[] args) {

        //Escreva um programa Java para obter a menor chave maior ou igual à chave fornecida. Retorna nulo se essa chave não existir.
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println(produto.ceilingKey("A"));
    }
}
