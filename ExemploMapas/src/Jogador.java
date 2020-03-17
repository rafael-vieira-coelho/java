import java.util.Objects;

public class Jogador {

    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }


    @Override
    public String toString() {
        return " nome: " + nome + "\nposicao: " + posicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return Objects.equals(nome, jogador.nome) &&
                Objects.equals(posicao, jogador.posicao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, posicao);
    }
}
