package Collections.Map;

import java.util.HashMap;

public class Ex7 {
    //Escreva um programa Java para remover todos os mapeamentos de um mapa.
    public static void main(String[] args) {
        HashMap<String,Double> produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);

        produto.clear();
        System.out.println(produto);
    }
}
