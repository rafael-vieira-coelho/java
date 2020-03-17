/*
2. [5,0] Crie um menu de opções no qual o usuário pode cadastrar 1000 cilindros 
(objetos da classe Cylinder). Para isto, utilize um vetor de objetos Cylinder. 
O usuário pode escolher calcular o volume do cilindro a partir da posição 
desejada no vetor. Além disso, ele pode remover cilindros a partir do valor 
de seu raio (ou seja, serão removidos todos os cilindros com o raio informado 
pelo usuário). Por fim, o usuário pode escolher sair do programa. Modularize o 
seu código através de métodos estáticos.
 */
package aula13exemplos;

import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class Ex2 {

    private static final int TAMANHO = 1000;
    private static final int CADASTRAR = 1;
    private static final int CALCULAR_VOLUME = 2;
    private static final int REMOVER_RAIO = 3;
    private static final int SAIR = 4;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cilindro[] vetor = new Cilindro[TAMANHO];
        int op;

        do {
            op = menu();
            switch (op) {
                case CADASTRAR:
                    Cilindro cilindro = ler_dados_cilindro(s);

                    if (cadastrar(vetor, cilindro)) {
                        System.out.println("cilindro de raio "
                                + cilindro.getRadius()
                                + " e altura "
                                + cilindro.getHeight()
                                + " cadastrado com sucesso.");
                    } else {
                        System.out.println("ERRO: Não foi possível cadastrar.");
                    }
                    break;
                case CALCULAR_VOLUME:
                    int posicao = ler_posicao(s);

                    calcular_volume(vetor, posicao);
                    break;
                case REMOVER_RAIO:
                    double raio = ler_raio(s);

                    remover(vetor, raio);
            }
            if (op < CADASTRAR || op > SAIR) {
                System.out.println("ERRO: Opção inválida.");
            }
        } while (op != SAIR);
    }

    private static int menu() {
        System.out.println("Menu de opções: ");
        System.out.println("[1] Cadastrar novo cilíndro");
        System.out.println("[2] Calcular volume do cilindro");
        System.out.println("[3] Remover cilindros a partir do raio");
        System.out.println("[4] Sair");
        return new Scanner(System.in).nextInt();
    }

    private static Cilindro ler_dados_cilindro(Scanner s) {
        System.out.println("Informe o raio:");
        double raio = s.nextDouble();
        System.out.println("Informe a altura:");
        double altura = s.nextDouble();
        return new Cilindro(raio, altura);
    }

    private static boolean cadastrar(Cilindro[] vetor, Cilindro cilindro) {
        for (int i = 0; i < TAMANHO; i++) {
            if (vetor[i] == null) {
                vetor[i] = cilindro;
                return true;
            }
        }
        return false;
    }

    private static int ler_posicao(Scanner s) {
        System.out.println("Qual a posição desejada? ");
        return s.nextInt();
    }

    private static void calcular_volume(Cilindro[] vetor, int posicao) {
        if (posicao >= 0 && posicao < TAMANHO && vetor[posicao] != null) {
            System.out.println("Volume: " + vetor[posicao].getVolume());
        } else {
            System.out.println("ERRO: Posição inválida.");
        }
    }

    private static double ler_raio(Scanner s) {
        System.out.println("Informe o raio:");
        return s.nextDouble();
    }

    private static void remover(Cilindro[] vetor, double raio) {
        for (int i = 0; i < TAMANHO; i++) {
            if (vetor[i].getRadius() == raio) {
                vetor[i] = null;
            }
        }
    }

}
