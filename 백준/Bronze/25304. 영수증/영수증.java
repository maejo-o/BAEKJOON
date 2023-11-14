import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // total price
        int N = sc.nextInt(); // number of object types
        int p = 0;
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt(); // price of object
            int b = sc.nextInt();  // number of object
            p += (a*b);
        }
        if(p == X) System.out.println("Yes");
        else System.out.println("No");
    }
}
