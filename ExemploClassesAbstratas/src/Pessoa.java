import java.util.List;
import java.util.Objects;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected List<Contato> contatos;

    public abstract void mostraContatos();

    public Pessoa(String n, String e) {
        nome = n;
        endereco = e;
    }

    public Pessoa(String n, String e, List<Contato> c) {
        nome = n;
        endereco = e;
        contatos = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco);
    }
}
