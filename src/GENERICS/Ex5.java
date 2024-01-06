package GENERICS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {

    public static void main(String[] args) {

        //Escreva um programa Java para criar um método genérico que pegue duas listas do mesmo tipo e
        //as mescle em uma única lista. Este método alterna os elementos de cada lista.

    List<Integer> lista1= Arrays.asList(4,2,5,8);
    List<Integer> lista2= Arrays.asList(7,8,9,10,12);
   System.out.println(mesclar(lista1,lista2));
    }
    public static <T> List<T>  mesclar(List<T> lista1,List<T> lista2){
        List<T> listaMesclada= new ArrayList<>();
        int j=0;
        int i;
        int tamanho= Math.max(lista1.size(), lista2.size());

       for (i=0; i<tamanho; i++){
           if (i < lista1.size()) {
               listaMesclada.add(lista1.get(i));
           }
           if (i < lista2.size()) {
               listaMesclada.add(lista2.get(i));
           }
       }
        return  listaMesclada;
    }

}
