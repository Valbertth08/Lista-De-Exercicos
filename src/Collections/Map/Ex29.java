package Collections.Map;

import java.util.TreeMap;

public class Ex29 {
//    Escreva um programa Java para obter um mapeamento de valor-chave associado à maior chave estritamente menor que a chave fornecida. Retorne nulo se essa chave não existir.
    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

       System.out.println(produto.lowerEntry("G")); ;//retorna  o antecessor,  ou seja, o estreitamente maior valor menor que o especificado. A diferenaça ele e o floowerEntry é que esse retorna somente o menor,
        //o outro retorna o que é igual também.

    }
}
