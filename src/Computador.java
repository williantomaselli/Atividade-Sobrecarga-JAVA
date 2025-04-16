//Crie uma classe Computador com atributos marca, modelo, preco e ano.
// Implemente três construtores com diferentes
// combinações de parâmetros.

public class Computador {
    String marca;
    String modelo;
    double preco;
    int ano;

    public Computador(String marca, String modelo, double preco, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }

    public Computador(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Computador(String marca){
        this.marca = marca;
    }
}
