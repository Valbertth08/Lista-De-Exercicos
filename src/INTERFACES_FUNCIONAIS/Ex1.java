package INTERFACES_FUNCIONAIS;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {

    //Crie um Predicate que verifica se um número é par.
    public static void main(String[] args) {
        List< Integer> numeros= new ArrayList<>();
        numeros.add(5);
        numeros.add(25);
        numeros.add(12);
        numeros.add(20);
        numeros.removeIf(p-> p%2 != 0);
        for (Integer i : numeros){
            System.out.println(i);
        }
    }
}
