package ARRAYS.Map;

import java.util.*;

public class Ex1 {
    // Desenvolva um programa para gerenciar o estoque de uma loja. Utilize um mapa para representar os produtos, onde as chaves são os nomes dos
    //produtos e os valores são as quantidades em estoque. Implemente métodos para adicionar produtos ao estoque,
    //remover produtos, atualizar a quantidade de um produto e verificar a disponibilidade de um produto específico.

    public static void main(String[] args) {
        int opcao;
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        Map<Produto,Integer> estoque= new TreeMap<>();
        System.out.println("-----------BEM VINDO A SEU CONTROLE DE ESTOQUE-----------");
        do {
            System.out.println("1.ADICIONAR PRODUTOS\n2.REMOVER PRODUTOS\n3.ATUALIZAR QUANTIDADE DO PRODUTO\n4.VERIFICAR PRODUTO\n5.SAIR");
            System.out.print("OPÇÃO: ");
            opcao= sc.nextInt();
            System.out.println();
            switch (opcao){
                case 1:
                    AdicionarProdutos(estoque,sc);
                    break;
                case 2:
                    RemoverProduto(estoque,sc);
                    break;
                case 3:
                    AtualizarEstoque(estoque,sc);
                    break;
                case 4:
                    VerificarEstoque(estoque);
                    break;
                case 5:
                    System.out.println("Encerrando o Programa");
                default:
                    System.out.println("Opcao invalida\n");

            }

        }while (opcao != 5);
        sc.close();
    }

    public static class Produto implements Comparable<Produto>{
        private String nome;
        private Double price;


        public Produto(String nome, Double price) {
            this.nome = nome;
            this.price = price;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Produto produto = (Produto) o;
            return Objects.equals(nome, produto.nome);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome);
        }

        @Override
        public String toString() {
            return  nome +" - PRECO UNITARIO: "+price;
        }

        @Override
        public int compareTo(Produto o) {
            return -this.price.compareTo(o.getPrice());
        }
    }

    public static void AdicionarProdutos(Map<Produto,Integer> estoque, Scanner sc){
        System.out.println("Quantos produtos quer adicionar? ");
        int numerosProdutos= sc.nextInt();
        for (int i=0; i<numerosProdutos; i++){
            System.out.println("PRODUTO "+(i+1));
            System.out.print("Informe o nome do produto:  ");
            sc.nextLine();
            String nome= sc.nextLine();
            System.out.print("Informe o valor do produto:  ");
            Double valor= sc.nextDouble();
            System.out.print("Informe o numero de unidades do produto:  ");
            int quantidade= sc.nextInt();
            if (estoque.containsKey(new Produto(nome,0.0)))
                System.out.println("Esse Produto ja existe dentro do estoque");
            else {
                estoque.put(new Produto(nome,valor),quantidade);
            }
            System.out.println("-----------------------------------------------");
        }
    }

    public static void RemoverProduto(Map<Produto,Integer> estoque, Scanner sc) {
        System.out.println("Quantos produtos quer remover? ");
        int numerosProdutos= sc.nextInt();

        for (int i=0; i<numerosProdutos; i++){
            System.out.println("PRODUTO "+(i+1));
            System.out.print("Informe o nome do produto:  ");
            sc.nextLine();
            String nome= sc.nextLine();
            if (estoque.containsKey(new Produto(nome,0.0))) {
                estoque.remove(new Produto(nome,0.0));
            }
            else {
                System.out.println("O produto não foi encontrado no estoque");
            }

            System.out.println("-----------------------------------------------");
        }

    }
    public static void AtualizarEstoque(Map<Produto,Integer> estoque, Scanner sc){
        System.out.println("Quantos produtos quer atualizar? ");
        int numerosProdutos= sc.nextInt();

        for (int i=0; i<numerosProdutos; i++){
            System.out.println("PRODUTO "+(i+1));
            System.out.print("Informe o nome do produto:  ");
            sc.nextLine();
            String nome= sc.nextLine();
            if (estoque.containsKey(new Produto(nome,0.0))) {
                System.out.print("Informe o numero de unidades do produto:  ");
                int quantidade= sc.nextInt();
                estoque.put(new Produto(nome,0.0),quantidade);
            }
            else {
                System.out.println("Este produdo ainda não foi cadastrado no Sistema");
            }

            System.out.println("-----------------------------------------------");
        }

    }
    public static void VerificarEstoque(Map<Produto,Integer> estoque){
        System.out.println("PROTUDOS NO ESTOQUE: ");

        for (Produto key: estoque.keySet()){
            System.out.println("PRODUTO: "+key+" - QUANTIDADE EM ESTOQUE: "+ estoque.get(key));
        }
        if(estoque.isEmpty()){
            System.out.println("Nenhum produto cadastro no estoque!\n");
        }
        System.out.println();
    }
}
