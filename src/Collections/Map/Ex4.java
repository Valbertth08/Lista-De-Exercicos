package Collections.Map;

import java.util.HashMap;

public class Ex4 {

    public static void main(String[] args) {
        HashMap<String,Double> produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);
        HashMap<String,Double> produto2= new HashMap<>();
        produto2.put("Microfone",200.0);
        produto2.put("Fone de ouvido",120.0);
        produto2.put("Placa mãe",2000.00);
        produto.putAll(produto2);

        System.out.println(produto);
    }

}
