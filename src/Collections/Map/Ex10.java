package Collections.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Ex10 {
    // Escreva um programa Java para criar uma visualização definida dos mapeamentos contidos em um mapa.

    public static void main(String[] args) {

        HashMap<String,Double> produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);
        Set set = produto.entrySet();//utilizando o entrySet que retorna um set com os  conjuntos de chave e valor do map

        System.out.println(set);
        System.out.println(produto);
    }

}
