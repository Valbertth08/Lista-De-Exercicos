package GENERICS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {
    //Escreva um programa Java para criar um método genérico que receba uma lista de qualquer tipo e
    // um elemento de destino. Retorna o índice da primeira
    //ocorrência do elemento alvo na lista. Retorne -1 se o elemento de destino não puder ser encontrado.

    public static void main(String[] args) {

        List<String> list= Arrays.asList("Jose","Pedro","Pedro");
        System.out.println(pesquisa(list,"Pedro"));
        List<Integer> numeros= Arrays.asList(5,6,70);
        System.out.println(pesquisa(numeros,6));

    }
    public static <T> int pesquisa(List<T> lista, T destino){
        int posicao=0;
        if( lista.contains(destino)){
            posicao= lista.indexOf(destino);
            }
        else {
            posicao=-1;
            }
        return posicao;
    }

}
