package Collections.Map;

import java.util.TreeMap;

public class Ex28 {
    //Escreva um programa Java para obter a menor chave estritamente maior que a chave fornecida. Retorne nulo se essa chave não existir.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

     System.out.println(produto.higherEntry("E"));//pega o valor sucessor dele, ou o maior valor estreitamente que o especificado
    }
}
