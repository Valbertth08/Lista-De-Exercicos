package INTERFACES_FUNCIONAIS;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

   // Implemente um Consumer que imprime cada elemento de uma lista de strings.
   public static void main(String[] args) {
       List<String> nomes= new ArrayList<>();
       nomes.add("jose");;
       nomes.add("Maria");
       nomes.add("Vinicius");
       nomes.forEach(System.out::println);
   }

}
