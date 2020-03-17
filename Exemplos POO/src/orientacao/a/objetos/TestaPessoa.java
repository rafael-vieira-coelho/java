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
public class TestaPessoa {
    public static void main(String[] args) {
        Endereco e = new Endereco("Farroupilha", "95180-000", 785, "Av. São Vicente", "RS");
        Pessoa p = new Pessoa();
        
        p.setNome("Josefina da Silva");
        p.setEndereco(e);
        
        System.out.println("Nome: " + p.getNome());
        System.out.println("Rua: " + p.getEndereco().getRua());
        System.out.println("Cep: " + p.getEndereco().getCep());
    }
}
