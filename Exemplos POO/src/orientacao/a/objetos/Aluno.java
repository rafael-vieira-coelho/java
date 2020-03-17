/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao.a.objetos;

/**
 *
 * @author Coelho
 */
public class Aluno {
    String nome;
    String data;
    int rg;
    float notas[];
    Endereco endereco;
    
    public float[] obtem_notas() {
        return notas;
    }
    
    public void preenche_notas(float nota1, float nota2, float nota3){
        notas = new float[3];
        
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
    }
    
    public float calcula_media() {
        float soma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];            
        }
        return soma/notas.length;
    }
    
    public void mostra_dados() {
        System.out.println("=================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.data);
        System.out.println("RG: " + this.rg);
        System.out.println("Média: " + calcula_media());
    }
}
