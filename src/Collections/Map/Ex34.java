package Collections.Map;

import java.util.TreeMap;

public class Ex34 {
    //Escreva um programa Java para obter a parte de um mapa cujas chaves variam de uma determinada chave (inclusiva) a outra chave (exclusiva).

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println(produto.subMap("A","D"));//O valor de incio é incluido no subMap e o parametro do final é excluido do intervalor
        //pega somente o incio do intervalo e o meio dele
    }
}
