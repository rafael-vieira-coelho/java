/*
A classe Conta deve possuir um atributo que represente o saldo da conta. 

Este atributo deve ser inicializado através de um construtor parametrizado que 
valide o valor enviado como parâmetro. 

Devem ser criados métodos para mostrar 
o saldo, para crédito e para débito na conta. Note que se o valor de débito 
for maior que o saldo, deve ser impressa uma mensagem de erro. 

Crie métodos get e set para todos os atributos. Crie também um método toString 
que retorne uma String contendo os dados de todos os atributos.
 */
package lista15.Exerc4;

public class Conta {

    void credito(double valor) {
        saldo += valor;
    }
    
    boolean debito(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
    
    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }    
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
        else
            this.saldo = 0;
    }
    
    protected double saldo;
}
