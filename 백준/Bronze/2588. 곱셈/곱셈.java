import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int result3 = A * (B % 10);
        int result4 = (A * ((B % 100) - (B % 10))/10);
        int result5 = A * (B / 100);
        int result6 = result3 + result4*10 + result5*100;
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }


}
