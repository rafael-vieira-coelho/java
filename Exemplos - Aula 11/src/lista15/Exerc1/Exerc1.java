/*
 1. Crie uma classe Empresa capaz de armazenar os dados de uma empresa 
(Nome, Endereço, Cidade, Estado, CEP e Telefone). 

Inclua um construtor sem argumentos e um com argumentos para inicialização dos atributos. Crie métodos get e set para todos os atributos. Crie também um método toString que retorne uma String contendo os dados de todos os atributos.  

Utilize a classe Empresa como base para criar a classe Restaurante. 
Esta classe derivada deve conter atributos que representem o tipo de comida e o 
preço médio de um prato. 

Crie um construtor para esta classe que chame explicitamente o construtor da 
classe Empresa, gets e sets para seus atributos, além de um método toString, 
que utiliza o método toString da classe base (classe mãe). 

Crie um método main para testar sua aplicação.
 */
package lista15.Exerc1;

public class Exerc1 {
    public static void main(String[] args) {
        Endereco e = new Endereco("Júlio de Castilhos", 1154, "centro", "Apto. 201");
        Restaurante r = new Restaurante("Restaurante do Parque", e, "Farroupilha", "RS", "95180000", "3231-3493", "Buffet", 15f);
    }
}
