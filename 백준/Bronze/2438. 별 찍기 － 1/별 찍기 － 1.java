import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bfr.readLine());
        // StringTokenizer st;

        String star = "*";
        for(int i = 0; i < N; i++) {
            // st = new StringTokenizer(bfr.readLine());
            System.out.println(star);
            star += "*";
        }

        System.out.println(" ");
        bfr.close();
    }
}
