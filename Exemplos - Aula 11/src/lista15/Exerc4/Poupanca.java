/*
A classe Poupanca deve possuir um atributo relacionado à variação (rendimento), 
com métodos getter, setter e construtor. 

Crie também um método CalculaRendimento, que informa o valor do saldo 
multiplicado pela taxa de rendimento.

 */
package lista15.Exerc4;

public class Poupanca extends Conta {
    private double variacao;

    public double getVariacao() {
        return variacao;
    }

    public void setVariacao(double variacao) {
        this.variacao = variacao;
    }

    public Poupanca(double saldo, double v) {
        super(saldo);
        variacao = v;
    }
    
    public double calculaRendimento() {
        return variacao*saldo;
    }
}
