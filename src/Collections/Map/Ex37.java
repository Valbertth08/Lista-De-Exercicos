package Collections.Map;

import java.util.TreeMap;

public class Ex37 {
    //Escreva um programa Java para obter uma parte de um mapa cujas chaves sejam maiores que uma determinada chave.

    public static void main(String[] args) {
        TreeMap<String,Double> produto= new TreeMap<>();
        produto.put("A",2000.0);
        produto.put("C",400.0);
        produto.put("E",120.0);
        produto.put("G",120.0);

        System.out.println(produto.tailMap("C",false));// por padrão o valor especificado também faz parte do submap porque o metodo pega o valor maior igual
        //caso queria so o maior, é preciso colocar o parametro de inclusão false para pegar somente valores maiores que o especificado.
    }
}
