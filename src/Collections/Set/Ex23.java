package Collections.Set;

import java.util.TreeSet;

public class Ex23 {
    //Escreva um programa Java para obter o elemento em uma árvore definida menor ou igual ao elemento fornecido.


    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(49);
        numeros.add(21);
        numeros.add(22);

       System.out.println(numeros.floor(48));//retorna o maior numero  menor  ou igual ao especificado
        //esse numero retorna  a maior ocorrencia da lista original, ou seja, o maior numero menor ou igual ao especificado
    }

}
