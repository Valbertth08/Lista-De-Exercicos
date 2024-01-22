package Collections.Map;

import java.util.TreeMap;

public class Ex36 {
    //Escreva um programa Java para obter uma parte de um mapa cujas chaves sejam maiores ou iguais a uma determinada chave.
    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println(produto.tailMap("C"));;//pegando uma parte do map que seja maior ou igual que o valor especificado


    }
}
