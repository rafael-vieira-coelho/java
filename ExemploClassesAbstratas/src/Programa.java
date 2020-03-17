import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList();
        Contato c1 = new Contato("Joe", "(21)3231221");
        Contato c2 = new Contato("Mary", "(54)3216788");

        contatos.add(c1);
        contatos.add(c2);
        Pessoa p1 = new PessoaFisica(
                "Phil",
                "Downtown, 123.",
                contatos,
                123123,
                43444319
        );
        Pessoa p2 = new PessoaJuridica(
                "Google",
                "California...",
                5464562333l,
                "Empresa de Tecnologia"
        );
        System.out.println(p1);
        System.out.println(p2);
        if (!p1.equals(p2)) {
            System.out.println("São objetos distintos.");
        } else {
            System.out.println("Os objetos são iguais.");
        }

        Pessoa p3 = new PessoaFisica(
                "Phil",
                "Downtown, 123.",
                contatos,
                123123,
                43444319
        );
        if (!p1.equals(p3)) {
            System.out.println("São objetos distintos.");
        } else {
            System.out.println("Os objetos são iguais.");
        }
        p1.mostraContatos();
        p2.mostraContatos();
        p3.mostraContatos();
    }
}
