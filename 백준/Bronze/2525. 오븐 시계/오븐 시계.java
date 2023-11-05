import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int timeH = sc.nextInt();
        int timeM = sc.nextInt();
        int cookM = sc.nextInt();

        int finishM = timeM + cookM;
        if(finishM < 60) {
            System.out.println(timeH + " " + finishM);
        }
        else {
            timeH += finishM/60;
            finishM = finishM%60;
            if(timeH >= 24)  {
                timeH -= 24;
            }
            System.out.println(timeH + " " + finishM);
        }

    }
   }