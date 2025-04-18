package application;

import entities.Conta;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int opcao;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o número da conta a ser criada? ");
        int nConta = sc.nextInt();
        System.out.print("Qual o nome do titular do conta a ser criada? ");
        String titular = sc.next();
        System.out.print("Qual o depósito inicial? ");
        double deposito = sc.nextDouble();
        Conta conta = new Conta(nConta,titular,deposito);

        do {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("Consultar saldo - 1");
            System.out.println("Consultar cheque especial - 2");
            System.out.println("Depositar dinheiro - 3");
            System.out.println("Sacar dinheiro - 4");
            System.out.println("Pagar um boleto - 5");
            System.out.println("Encerrar o programa - 6");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(conta.toString());
                    break;
                case 2:
                    System.out.println("Cheque especial: " + conta.getChequeEspecial());
                    break;
                case 3:
                    System.out.print("Qual o valor que deseja depositar? ");
                    deposito = sc.nextDouble();
                    conta.deposito(deposito);
                    break;
                case 4:
                    System.out.print("Qual o valor que deseja sacar? ");
                    double saque = sc.nextDouble();
                    conta.saque(saque);
                    break;
                case 5:
                    System.out.print("Qual o valor que deseja pagar? ");
                    double pagar = sc.nextDouble();
                    conta.pagarBoleto(pagar);
                    break;
            }
        } while (opcao != 6);

        sc.close();

    }

}
