package Collections.Map;

import java.util.TreeMap;

public class Ex24 {
    //Escreva um programa Java para obter um mapeamento de valor-chave associado à maior chave menor ou igual à chave fornecida

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        /*produto.put(5,400.0);
        produto.put(10,400.0);
        produto.put(20,400.0);
        produto.put(40,400.0);*/
        System.out.println(produto.floorEntry("G"));//retornar a maior chave menor ou igual  que o valor especificado(basicamente antecessor)
        //A contagem do maior é contada de baixo pra cima
        //E somente pega os valores que possoui dentro do treeMap
       System.out.println(produto);
    }
}
