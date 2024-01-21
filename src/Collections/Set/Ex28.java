package Collections.Set;

import java.util.TreeSet;

public class Ex28 {
    //Escreva um programa Java para obter um elemento em um conjunto de árvore que tenha um valor inferior ao elemento fornecido.

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(10);
        numeros.add(49);
        numeros.add(21);
        numeros.add(22);
        numeros.remove(21);
        System.out.println(numeros.lower(21)); //retorna o maior valor inferior em comparação ao  numero fornecido
        //ou seja, antecessor.
    }

}
