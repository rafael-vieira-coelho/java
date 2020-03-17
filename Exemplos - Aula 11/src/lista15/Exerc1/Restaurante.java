/*
Utilize a classe Empresa como base para criar a classe Restaurante. 
Esta classe derivada deve conter atributos que representem o tipo de comida e o 
preço médio de um prato. 

Crie um construtor para esta classe que chame explicitamente o construtor da 
classe Empresa, gets e sets para seus atributos, além de um método toString, 
que utiliza o método toString da classe base (classe mãe). 
 */
package lista15.Exerc1;

public class Restaurante extends Empresa {
    
    private String tipoComida;
    private float precoMedio;

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public float getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(float precoMedio) {
        this.precoMedio = precoMedio;
    }

    public Restaurante(String nome, Endereco endereço, String cidade, 
            String estado, String cep, String telefone,
            String tipo, float preco) {
        super(nome, endereço, cidade, estado, cep, telefone);
        tipoComida = tipo;
        precoMedio = preco;
    }
    
    
}
