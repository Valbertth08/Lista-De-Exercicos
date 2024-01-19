package Collections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Ex18 {
    //Escreva um programa Java para copiar uma lista vinculada para outra lista vinculada.
    public static void main(String[] args) {
        LinkedList<String> nomes= new LinkedList<>();
        nomes.add("Carlos");
        nomes.add("Andre");
        nomes.add("raimundo");
        LinkedList<String> nomes2= new LinkedList<>();
        nomes2.add("alex");
        nomes2.add("pedro");
        nomes2.add("italo");
        Collections.copy(nomes2,nomes);//os valores de nomes foram copiados para nomes2
        //OBS: se a lista em que voce pretende receber os valores, não tiver a mesma quantidade de posições(valores) que a outra, irar dar um erro
        //ou seja, precisam ter o mesmo tamanho para copiar um elemento do outro.
        //Para conseguir fazer com que os elementos sejam adicionados mesmo com a outra lista vazia é necessario fazer um clone
        //Ex:
        LinkedList<String> nomes3= (LinkedList)nomes.clone();
        System.out.println(nomes3);

    }
}
