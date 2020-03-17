import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1001 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int X = A + B;

        System.out.println("X = " + X);
    }
}
