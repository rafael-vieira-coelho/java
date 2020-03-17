import java.util.List;
import java.util.Objects;

public class PessoaFisica extends Pessoa {

    private int rg;
    private int cpf;

    @Override
    public void mostraContatos() {
        for (Contato c:super.contatos) {
            System.out.println(c);
        }
    }

    public PessoaFisica(String n, String e, int rg, int cpf) {
        super(n, e);
        this.rg = rg;
        this.cpf = cpf;
    }

    public PessoaFisica(String n, String e, List<Contato> c, int rg, int cpf) {
        super(n, e, c);
        this.rg = rg;
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "PessoaFisica{" +
                super.toString() +
                "rg=" + rg +
                ", cpf=" + cpf +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return rg == that.rg &&
                cpf == that.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rg, cpf);
    }
}
