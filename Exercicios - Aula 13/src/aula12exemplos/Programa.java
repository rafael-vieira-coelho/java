package aula12exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 *
 * @author coelho
 */
public class Programa {

    public static void main(String[] args) throws IOException {
        Payment p = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int op;
        do {
            System.out.println("1 - Cash | 2 - Check | 3 - Credit | 4 - Wire Transfer | 5 - End Program");
            op = Integer.parseInt(br.readLine());

            switch (op) {
                case 1:
                    p = new Cash(5f, 10f);
                    break;
                case 2:
                    p = new Check("BB", "1233", true, 100f);
                    break;
                case 3:
                    p = new Credit("1233231231232", "Credit", new Date(2019, 04, 11), 2000f);
                    break;
                case 4:
                    p = new WireTransfer("1233231231232", "BB", 1567.89f);
                    break;
                case 5:
                    System.out.println("Good bye...");
                    break;
                default:
                    System.err.println("Invalid option.");
            }
            if (op >= 1 && op <= 4) {
                System.out.println(p);
            }
        } while (op != 5);
    }
}
