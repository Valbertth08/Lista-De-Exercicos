package Collections.ArrayList;

import java.util.ArrayList;

public class Ex16 {
    //Escreva um programa Java para clonar uma lista de arrays em outra lista de arrays.
    public static void main(String[] args) {


        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        ArrayList<String> clone= (ArrayList<String>) nomes1.clone();//preciso fazer um cast para arrayList porque o clone retorna um object
        System.out.println(clone);
        //O metodo clone so funciona em arryalist
    }

}
