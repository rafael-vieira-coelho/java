import java.util.Objects;

public class PessoaJuridica extends Pessoa {

    private long cnpj;
    private String tipo;

    @Override
    public void mostraContatos() {
        System.out.println("Não temos contatos de pessoas físicas.");
    }

    public PessoaJuridica(String n, String e, long c, String t) {
        super(n, e);
        cnpj = c;
        tipo = t;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                super.toString() +
                "cnpj=" + cnpj +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return cnpj == that.cnpj &&
                Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cnpj, tipo);
    }
}
