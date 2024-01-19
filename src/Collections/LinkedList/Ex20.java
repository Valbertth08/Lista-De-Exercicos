package Collections.LinkedList;

import java.util.LinkedList;

public class Ex20 {
   // Escreva um programa Java para recuperar, mas não remover, o primeiro elemento de uma lista vinculada.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
       nomes.add("Andre");
        nomes.add("raimundo");

      String valor=  nomes.peekFirst();//o peeKFirst  retorna null caso o valor não exista e pega o primeiro valor
      System.out.println("Valor: "+valor);
      System.out.println(nomes);
    }
}
