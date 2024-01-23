package Generics;

import java.util.*;

public class Ex7 {

    //Escreva um programa Java para criar um método genérico que pegue um mapa de qualquer tipo e imprima cada par de valores-chave.
    public static void main(String[] args) {

        Comparator<Integer> com= (p,q)->p.compareTo(q);
        Map<Integer,String> map = new TreeMap<>(com);
        map.put(1,"Arroz");
        map.put(3,"Peixe");
        map.put(5,"Farinha");
        metodo(map);
    }

    public static <K,V>void metodo(Map<K,V>map){//generic para o map
        for(K chave: map.keySet()){
            System.out.println("Chave: "+chave+" Valor: "+map.get(chave));
        }
    }

}
