package Collections.Map;

import java.util.HashMap;

public class Ex11 {
    //Escreva um programa Java para obter o valor de uma chave especificada em um mapa.

    public static void main(String[] args) {
        HashMap<String,Double> produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);

        System.out.println(produto.get("Tv"));
    }
}
