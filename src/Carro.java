//Implemente uma classe Carro com três construtores: um que receba apenas
//o modelo, outro com modelo e ano, e outro com modelo, ano e marca.

public class Carro {
    String modelo;
    String marca;
    int ano;

    //Construtores
    public Carro(String modelo){
        this.modelo = modelo;
    }

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String modelo, int ano, String marca){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }
}
