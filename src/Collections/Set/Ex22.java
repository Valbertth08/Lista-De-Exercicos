package Collections.Set;

import java.util.TreeSet;

public class Ex22 {
    //
    public static void main(String[] args) {
        //Escreva um programa Java para obter o elemento em um conjunto de árvore que seja maior ou igual ao elemento fornecido.]

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(49);
        numeros.add(21);
        numeros.add(22);

        System.out.println(numeros.ceiling(20));//verificando se existe valores maiores ou igual o elemento especificado
        //essa função  pega o menor elemento do conjunto original que seja maior igual o elemento especificado

    }
}
