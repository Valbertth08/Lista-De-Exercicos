package Collections.LinkedList;

import java.util.LinkedList;

public class Ex21 {
    //Escreva um programa Java para recuperar, mas não remover, o último elemento de uma lista vinculada
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");

        String valor=  nomes.peekLast();//o peekLast  retorna null caso o valor não exista, e pega o ultimo valor
        System.out.println("Valor: "+valor);
        System.out.println(nomes);
    }
}
