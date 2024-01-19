package Collections.ArrayList;

import java.util.ArrayList;

public class Ex20 {
    //Escreva um programa Java para aumentar o tamanho de uma lista de array.
    public static void main(String[] args) {

        ArrayList<String> nomes1= new ArrayList<>();
        nomes1.add("Roberto");
        nomes1.add("Raimundo");
        nomes1.add("Mariana");
        nomes1.ensureCapacity(4);//aumenta a capacidade do arraylist sem fazer realocação, isso garante um melhor desempenho em execução

    }
}
