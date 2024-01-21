package Collections.Map;

import java.util.HashMap;

public class Ex3 {
    //Escreva um programa Java para contar o número de mapeamentos de valores-chave (tamanho) em um mapa.

    public static void main(String[] args) {
        HashMap<String,Double> produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);

       System.out.println(produto.size());
    }
}
