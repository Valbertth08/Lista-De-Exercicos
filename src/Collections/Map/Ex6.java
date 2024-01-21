package Collections.Map;

import java.util.HashMap;

public class Ex6 {
    //Escreva um programa Java para obter uma cópia superficial de uma instância HashMap.
    public static void main(String[] args) {
        HashMap<String,Double> produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);
        HashMap<String,Double> produto2= new HashMap<>();
        produto2 = (HashMap<String, Double>) produto.clone();
        System.out.println(produto2);

    }
}
