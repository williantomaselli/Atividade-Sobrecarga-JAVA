//Crie uma classe Produto com os atributos nome, preco e quantidade.
// Implemente um construtor que inicialize todos os atributos.

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Modifique a classe Produto para incluir uma sobrecarga
    // de construtor que receba apenas nome e preco.

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String toString(){
        return "Seu produto é " + nome +
                ", custa R$" + preco +
                ", e a quantidade é de " + quantidade;
    }

    //Adicione à classe Produto um método exibirInformacoes()
    // e chame esse método no main após a criação do objeto.

    public void exibirInformacoes(String nome, int quantidade, double preco){
        System.out.println("O nome do seu produto é " + nome +
                ", o seu produto custa R$" + preco +
                ", e a quantidade selecionada é de " + quantidade);
    }
}
