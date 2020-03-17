package colecoes;

import java.util.ArrayList;

/**
 *
 * @author coelho
 */
public class Aluno {
    private ArrayList<Float> notas;
    private String nome;
    private boolean passou;

    public Aluno(ArrayList<Float> notas, String nome) {
        this.notas = notas;
        this.nome = nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList();
    }

    public void adiciona_nota(float n) {
        notas.add(n);
    }
    
    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPassou() {
        return passou;
    }

    public void setPassou(boolean passou) {
        this.passou = passou;
    }
    
    
}
