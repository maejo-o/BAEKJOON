import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M < 45) {
            if(H == 0) H = 23;
            else H--;
            M = 60 + (M - 45);

            System.out.println(H + " " + M);

        }
        else
            System.out.println(H + " " + (M-45));
    }
}
