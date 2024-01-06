package GENERICS;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    //Escreva um programa Java para criar um método genérico que pegue dois
    //arrays do mesmo tipo e verifique se eles possuem os mesmos elementos na mesma ordem.


    public static void main(String[] args) {
        List<Integer> lista1 =  Arrays.asList(5,6,7);
        List<Integer> lista2 =  Arrays.asList(7,6,7);
        Verificar(lista1,lista2);
    }
    public static <T> void Verificar(List<T> lista1 , List<T> lista2){

      if( lista1.size()== lista2.size()){
          System.out.println("Tem o mesmo tamanho");
      }
      else{
          System.out.println("Tamanho diferente");
      }
      boolean teste= true;
      for (int i =0; i< lista1.size(); i++){
          if (!lista1.get(i).equals(lista2.get(i))){
              teste=false;
                break;
          }
      }
      if(teste){
          System.out.println("Possuem Elementos e ordens iguais");
      }
      else {
          System.out.println("Possuem Elementos diferentes ou ordem diferente");
      }


    }
}
