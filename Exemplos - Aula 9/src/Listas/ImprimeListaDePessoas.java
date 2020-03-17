/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.*;

public class ImprimeListaDePessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joe", "av. Brisbem");
        Pessoa p2 = new Pessoa("Jack", "av. Bourbon");
        Pessoa p3 = new Pessoa("Mary", "av. Brisbem");
        
        ArrayList<Pessoa> listaDePessoas = new ArrayList();
        
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        Iterator iteListaDePessoas = listaDePessoas.iterator();

        while (iteListaDePessoas.hasNext()) {
            Pessoa pessoaRecuperada = (Pessoa) iteListaDePessoas.next();
            System.out.println(pessoaRecuperada.getNome());
            System.out.println(pessoaRecuperada.getEndereco());
        }
    }
}
