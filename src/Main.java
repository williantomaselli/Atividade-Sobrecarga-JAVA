//Crie um programa que solicite ao usuário os dados de um
//produto e o instancie com base nos dados inseridos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do produto? ");
        String nome = scanner.nextLine();

        System.out.println("Qual o preço do produto? ");
        double preco = scanner.nextDouble();

        System.out.println("Qual a quantidade do produto? ");
        int quantidade = scanner.nextInt();

        Produto produto1 = new Produto(nome, preco, quantidade);

        produto1.exibirInformacoes(produto1.nome, produto1.quantidade, produto1.preco);

        //Simulando criação de livros
        getBookInfo(scanner);
        getBookInfo(scanner);
        getBookInfo(scanner);

    }
    public static Livro getBookInfo(Scanner scanner) {
        System.out.println("Digite o nome do livro");
        String nomeLivro = scanner.nextLine();

        System.out.println("Digite o autor do livro");
        String autorLivro = scanner.nextLine();

        System.out.println("Digite o preco do livro");
        double precoLivro = scanner.nextDouble();

        return new Livro(nomeLivro, autorLivro, precoLivro);
    }

}
