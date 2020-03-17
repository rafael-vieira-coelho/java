/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao.a.objetos;

/**
 *
 * @author coelho
 */
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saque(double valor) throws ExceptionSaqueInvalido {
        if (valor > limite) {
            throw new ExceptionSaqueInvalido("Você quer sacar mais do que tem.");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() + "limite=" + limite + '}';
    }



        
}
