package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {

    //Escreva um programa Java para associar o valor especificado à chave especificada em um HashMap.
    public static void main(String[] args) {
        HashMap<String,Double>produto= new HashMap<>();
        produto.put("Tv",2000.0);
        produto.put("Monitor",400.0);
        produto.put("Mouse",120.0);
        produto.put("Teclado",80.0);


        for (String chave: produto.keySet()){
            System.out.println("Chave: "+ chave+" Valor: "+produto.get(chave));

        }
       /* for(Map.Entry x:produto.entrySet()){
           System.out.println(x.getKey()+" "+x.getValue());
       }*/
        //Essa forma também é valida e produz o mesmo resultado que a primeira
    }
}
