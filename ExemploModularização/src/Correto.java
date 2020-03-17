import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correto {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final int
            OPCAO_POTENCIA = 1,
            OPCAO_SENO = 2,
            OPCAO_TANGENTE = 3;

    public static void main(String[] args) throws IOException {
        int opcao = mostrarMenu();

        switch (opcao) {
            case OPCAO_POTENCIA: {
                calcula_potencia();
                break;
            }
            case OPCAO_SENO: {
                double angulo = lerDouble("Qual o valor do angulo?");
                double r = calculaSeno(angulo);

                mostraResultado(r);
                break;
            }
            case OPCAO_TANGENTE: {
                double angulo = lerDouble("Qual o valor do angulo?");
                double r = calculaTangente(angulo);

                mostraResultado(r);
            }
        }
    }

    public static void calcula_potencia() throws IOException {
        double x = lerDouble("Qual o valor de x?");
        double y = lerDouble("Qual o valor de y?");
        double r = calculaPotencia(x, y);

        mostraResultado(r);
    }

    public static int mostrarMenu() throws IOException {
        System.out.println("O que você quer da vida?");
        System.out.println("1 - Potência");
        System.out.println("2 - Seno");
        System.out.println("3 - Tangente");
        return Integer.parseInt(br.readLine());
    }

    public static double lerDouble(String texto) throws IOException {
        System.out.println(texto);
        return Double.parseDouble(br.readLine());
    }

    public static double calculaPotencia(double x, double y) {
        return Math.pow(x, y);
    }

    public static void mostraResultado(double r) {
        System.out.println(r);
    }

    public static double calculaSeno(double a) {
        return Math.asin(a);
    }

    public static double calculaTangente(double a) {
        return Math.atan(a);
    }
}
