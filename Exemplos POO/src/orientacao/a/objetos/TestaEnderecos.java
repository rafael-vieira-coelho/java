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
public class TestaEnderecos {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Farroupilha", "95180-000", 785, "Av. São Vicente", "RS");
        Endereco e2 = new Endereco("Farroupilha", "95180-000", 122, "Pena de Moraes", "RS");
        
        Endereco []vetor;
        
        vetor = new Endereco[3];
        
        vetor[0] = e1;
        vetor[1] = e2;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null)
                System.out.println("Rua: " + (i + 1) + " " + vetor[i].getRua());            
        }
    }
}
