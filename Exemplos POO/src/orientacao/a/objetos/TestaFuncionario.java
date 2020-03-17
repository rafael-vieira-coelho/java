/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao.a.objetos;

import orientacao.a.objetos.Funcionario;

/**
 *
 * @author Coelho
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        
        f.nome = "Jorge";
        f.salario = 789.67;
        System.out.println("Nome: " + f.nome);        
        System.out.println("Salário: " + f.salario);
    }
}
