/*
A classe ContaCorrente deve incluir um atributo que represente a taxa cobrada 
por cada transação de crédito/débito, com getter, setter e construtor. 

Redefina os métodos de crédito e débito para descontar o valor de tal taxa a 
cada transação bem sucedida. Os métodos originais da classe Conta devem ser 
invocados na redefinição. Crie um método main para testar sua aplicação.

 */
package lista15.Exerc4;

public class ContaCorrente extends Conta {
    private double taxa;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public ContaCorrente(double saldo, double t) {
        super(saldo);
        taxa = t;
    }

    @Override
    void credito(double valor) {
        super.credito(valor);
        super.saldo -= taxa;
    }

    @Override
    boolean debito(double valor) {
        if(super.debito(valor)) {
            super.saldo -= taxa;
            return true;
        }
        return false;
    }    
}
