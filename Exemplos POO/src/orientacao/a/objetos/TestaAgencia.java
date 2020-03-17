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
public class TestaAgencia {
    public static void main(String[] args) {
        Agencia a = new Agencia();
        
        a.numero = 19;        
        System.out.println("Número da Agência:" + a.numero);        
        a.numero = 5;        
        System.out.println("Número da Agência:" + a.numero);                
    }    
}
