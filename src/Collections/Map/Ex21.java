package Collections.Map;

import java.util.TreeMap;

public class Ex21 {
    //Escreva um programa Java para obter um mapeamento de valor-chave associado à maior e à menor chave em um mapa.
    public static void main(String[] args) {

        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);

        System.out.println(produto.firstEntry());
        System.out.println(produto.lastEntry());

     }
}
