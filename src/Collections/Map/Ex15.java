package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex15 {
    //Escreva um programa Java para copiar o conteúdo do Tree Map para outro Tree Map.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);

        TreeMap<String,Double> produto2= new TreeMap<>();
        produto2.put("Microfone",200.0);
        produto2.put("Fone de ouvido",120.0);
        produto2.put("Placa mãe",2000.00);

        produto.putAll(produto2);
        System.out.println(produto);


    }
}
