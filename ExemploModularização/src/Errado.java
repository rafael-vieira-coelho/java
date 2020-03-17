import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Errado {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("O que voê quer da vida?");
        System.out.println("1 - Potência");
        System.out.println("2 - Seno");
        System.out.println("3 - Tangente");
        int opcao = Integer.parseInt(br.readLine());

        switch (opcao) {
            case 1: {
                System.out.println("Qual o valor de x?");
                double x = Double.parseDouble(br.readLine());

                System.out.println("Qual o valor de y?");
                double y = Double.parseDouble(br.readLine());
                double r = Math.pow(x, y);

                System.out.println(r);
                break;
            }
            case 2: {
                System.out.println("Qual o valor do angulo?");
                double angulo = Double.parseDouble(br.readLine());
                double r = Math.asin(angulo);

                System.out.println(r);
                break;
            }
            case 3: {
                System.out.println("Qual o valor do angulo?");
                double angulo = Double.parseDouble(br.readLine());
                double r = Math.atan(angulo);

                System.out.println(r);
            }
        }
    }
}
