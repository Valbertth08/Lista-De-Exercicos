package Collections.Map;

import java.util.TreeMap;

public class Ex35 {
    //Escreva um programa Java para obter a parte de um mapa cujas chaves variam de uma determinada chave a outra chave

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

       System.out.println(produto.subMap("A",true,"E",true));//seria incluindo os valores do intervalo dentro do submap com o true

    }
}
