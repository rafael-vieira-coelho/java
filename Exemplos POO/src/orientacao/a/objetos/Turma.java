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
public class Turma {

    private int periodo;
    private String serie;
    private String sigla;
    private String tipo;

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        if (periodo >= 0)
            this.periodo = periodo;
        else
            this.periodo = 0;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public void modifica_sigla(String nova_sigla) {
        sigla = nova_sigla;
    }

    public void modifica_tipo(String novo_tipo) {
        tipo = novo_tipo;
    }

    public boolean modifica_periodo(int novo_periodo) {
        if (novo_periodo < 0) {
            return false;
        }
        periodo = novo_periodo;
        return true;
    }

    void mostrar_dados() {
        System.out.println("======================================");
        System.out.println("| Periodo: " + periodo 
                + "| Serie: " + serie 
                + "| Sigla: " + sigla 
                + "| Tipo:  " + tipo + " |");
    }
}
