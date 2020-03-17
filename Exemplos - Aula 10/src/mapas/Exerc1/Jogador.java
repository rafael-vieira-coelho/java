/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas.Exerc1;

import java.util.HashMap;

/**
 *
 * @author coelho
 */
public class Jogador {
    
    private String nome;
    private double salario;
    private String posicao;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
        HashMap<String, Double> salarios = new HashMap();
    
        salarios.put("Goleiro", 50000.0);
        salarios.put("Lateral", 20000.0);
        salarios.put("Zagueiro", 30000.0);
        salarios.put("Volante", 10000.0);
        salarios.put("Armador", 30000.0);
        salarios.put("Atacante", 30000.0);
        
        if (salarios.containsKey(posicao)) {
            this.salario = salarios.get(posicao);
        } else {
            this.salario = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", salario=" + salario + ", posicao=" + posicao + '}';
    }
    
    
    
}
