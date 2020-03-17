/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao.a.objetos;

/**
 *
 * @author Coelho
 */
public class TestaConta {
    public static void main(String[] args) {
                
        Conta c = new ContaCorrente(0, 0, 0);
        
        c.setSaldo(100);        
        System.out.println("Saldo é " + c.getSaldo());        
        c.sacar(100.9);
    }
}
