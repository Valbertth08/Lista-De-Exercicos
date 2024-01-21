package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex12 {
    ///Escreva um programa Java para alterar a prioridadeQueue para a fila de prioridade máxima.

    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");
        String valor;
        while ((valor = cores.poll())!= null){
            System.out.println(valor);
        }
        System.out.println(cores);
        //Como o metodo poll retorna e remove do começo da lista, foi possivel demosntrar no while até  lista ficar vazia
    }

}
