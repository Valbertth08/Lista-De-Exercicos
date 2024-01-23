package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex6 {
    //Escreva um programa Java para criar um método genérico que receba uma lista de qualquer tipo e um predicado. Ele retorna uma lista de array contendo apenas elementos que satisfazem o predicado.
    public static void main(String[] args) {
       /* List<String> list = new ArrayList<>();
        list.add("Valor");
        list.add("telefone");
        list.add("televisão");
        list.add("ovo");
        Predicate<String> pred= p-> p.length()<=5;
        System.out.println( metodo(list,pred));*/
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(23);
        list.add(40);
        Predicate<Integer> pred= p-> (p%2)==0;
        System.out.println( metodo(list,pred));
    }
    public static <T> List<T> metodo(List<T> list, Predicate<T> pred){
        List<T> valores= new ArrayList<>();
        for ( T valor : list){
            if( pred.test(valor)){
                valores.add(valor);
            }
        }

        return  valores;
    }


}
