import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] intArr;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bfr.readLine());
        intArr = new int[N];
        StringTokenizer st;
        st = new StringTokenizer(bfr.readLine());
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(bfr.readLine());
        int count = 0;
        for(int j = 0; j < intArr.length; j++) {
            if(intArr[j] == v) {
                count++;
            }
        }
        bfw.write(count + "\n");
        bfr.close();
        bfw.flush();
        bfw.close();


    }
}
