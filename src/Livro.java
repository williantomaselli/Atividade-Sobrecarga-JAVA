//Simule a criação de três objetos da classe Livro,
//usando diferentes construtores sobrecarregados.

import java.util.Scanner;

public class Livro {
    String nome;
    String autor;
    double preco;

    public Livro(String nome, String autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Livro(String nome){
        this.nome = nome;
    }


}
