/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coelho
 */
public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta("João da Silva", 98098098, 8900);
     
        c1.creditar(700);
        c2.creditar(800);
        
        System.out.println(c2.getCliente());
        System.out.println(c2.verificeCredor());
        c2.setCliente("Gustavo Bebbiano");
        System.out.println(c2.getCliente());
    }
}
