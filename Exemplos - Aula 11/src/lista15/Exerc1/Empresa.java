/*
 1. Crie uma classe Empresa capaz de armazenar os dados de uma empresa 
(Nome, Endereço, Cidade, Estado, CEP e Telefone). 

Inclua um construtor sem argumentos e um com argumentos para inicialização dos atributos. Crie métodos get e set para todos os atributos. Crie também um método toString que retorne uma String contendo os dados de todos os atributos.  
 */
package lista15.Exerc1;

public class Empresa {
    protected String nome;
    protected Endereco endereço;
    protected String cidade;
    protected String estado;
    protected String cep;
    protected String telefone;

    public Empresa(String nome, Endereco endereço, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }
    
    
}
