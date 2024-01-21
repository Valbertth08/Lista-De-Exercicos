package Collections.Map;

import java.util.HashMap;

public class Ex9 {
    //Escreva um programa Java para testar se um mapa contém um mapeamento para o valor especificado.

    public static void main(String[] args) {
        HashMap<String,Double> produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);
        produto.containsValue(400);//esse metodo verifica se tem o valor especificado dentro do mapa
    }
}
