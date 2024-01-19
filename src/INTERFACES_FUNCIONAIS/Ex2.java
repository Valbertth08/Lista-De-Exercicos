package INTERFACES_FUNCIONAIS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    //Utilize um Predicate para filtrar palavras de uma lista com base no comprimento (por exemplo, maior que 5).

    public static void main(String[] args) {
        List<String> nomes= new ArrayList<>();
        nomes.add("jose");;
        nomes.add("Maria");
        nomes.add("Vinicius");
        nomes= nomes.stream().filter(p-> p.length()>5).collect(Collectors.toList());
        nomes.forEach(System.out::println);
    }




}
