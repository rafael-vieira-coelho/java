/*
4. Crie uma hierarquia de herança que um banco possa utilizar para representar 
dois tipos de conta: poupança e conta corrente. 

Todos os clientes deste banco podem depositar e sacar dinheiro de suas contas.

A classe Conta deve possuir um atributo que represente o saldo da conta. 
Este atributo deve ser inicializado através de um construtor parametrizado que 
valide o valor enviado como parâmetro. Devem ser criados métodos para mostrar 
o saldo, para crédito e para débito na conta. Note que se o valor de débito 
for maior que o saldo, deve ser impressa uma mensagem de erro. 

Crie métodos get e set para todos os atributos. Crie também um método toString 
que retorne uma String contendo os dados de todos os atributos.

A classe Poupanca deve possuir um atributo relacionado à variação (rendimento), 
com métodos getter, setter e construtor. Crie também um método CalculaRendimento,
que informa o valor do saldo multiplicado pela taxa de rendimento.

A classe ContaCorrente deve incluir um atributo que represente a taxa cobrada 
por cada transação de crédito/débito, com getter, setter e construtor. 

Redefina os métodos de crédito e débito para descontar o valor de tal taxa a 
cada transação bem sucedida. Os métodos originais da classe Conta devem ser 
invocados na redefinição. Crie um método main para testar sua aplicação.
*/
package lista15.Exerc4;

public class Exerc4 {
    public static void main(String[] args) {
        Conta c1, c2;
        
        c1 = new ContaCorrente(100, 5);
        c2 = new Poupanca(50, 2);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1.credito(40);
        c2.credito(40);
        System.out.println(c1.toString());
        System.out.println(c2.toString());        
    }
}
