package entities;

public class Conta {

    int nConta;
    String titular;
    double saldo, chequeEspecial;

    public Conta(int nConta, String titular, double depositoInicial) {
        this.nConta = nConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public double getChequeEspecial() {
        if (saldoSemCheque() <= 500){
            chequeEspecial = 50;
        } else {
            chequeEspecial = saldoSemCheque() / 2;
        }
        return chequeEspecial;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo = getSaldo() - valor;
    }

    public void pagarBoleto(double valor) {
        saldo = getSaldo() - valor;
    }

    public double saldoSemCheque(){
        return saldo;
    }

    public double getSaldo() {
        return saldo + getChequeEspecial();
    }

    @Override
    public String toString() {
        return "O saldo é " + getSaldo();
    }
}
