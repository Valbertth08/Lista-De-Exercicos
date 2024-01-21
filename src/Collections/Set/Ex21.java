package Collections.Set;

import java.util.TreeSet;

public class Ex21 {
    // Escreva um programa Java para encontrar números menores que 7 em um conjunto de árvore.

    public static void main(String[] args) {
        //Escreva um programa Java para comparar dois conjuntos de árvores.

        TreeSet<Integer> numeros= new TreeSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(49);
        numeros.add(22);

         TreeSet<Integer> numMenores= (TreeSet<Integer>) numeros.headSet(7);//essa função faz com que pegue todos elementos menore que 7
         System.out.println(numMenores);
    }
}
