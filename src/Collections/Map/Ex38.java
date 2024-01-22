package Collections.Map;

import java.util.TreeMap;

public class Ex38 {
    //Escreva um programa Java para obter um mapeamento de valor-chave associado à menor chave maior ou
    // igual à chave fornecida. Retorne nulo se essa chave não existir

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println(produto.ceilingEntry("A"));//pega o valor que são maiores ou iguais o especificado
    }
}
