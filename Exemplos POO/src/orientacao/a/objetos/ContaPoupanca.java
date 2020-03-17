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
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }
    
    public void saquei() {
        super.saldo -= 100;
    }

    @Override
    public boolean sacar() {
        saldo -= 190;
        return true;
    }

    
}
