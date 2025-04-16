//Implemente uma classe ContaBancaria com dois construtores:
//um que receba o saldo inicial e outro que inicie com saldo zero.

import java.util.Scanner;

public class ContaBancaria {
    private double saldo;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    }
    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public ContaBancaria(){
        saldo = 0;
    }



}
