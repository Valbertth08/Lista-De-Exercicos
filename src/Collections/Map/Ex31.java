package Collections.Map;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Ex31 {
//Escreva um programa Java para obter uma visualização NavigableSet das chaves em um mapa.
    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println(produto.navigableKeySet());
    }
}
