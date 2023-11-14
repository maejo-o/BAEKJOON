import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader, readLine() 을 이용해서 입력을 받았음
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Integer.parseInt() 가 String-> int 형변환 해주는거임
        int N = Integer.parseInt(bfr.readLine());


        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            // 문자열 분리를 위해서 매 반복마다 StringTokenizer 을 생성하고 동시에 문자를 입력 받는다
            st = new StringTokenizer(bfr.readLine(), " ");
            // Integer.parseInt() 가 String-> int 형변환 해주는거임
            bfw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bfr.close();
        bfw.flush(); // 버퍼를 비운다
        bfw.close(); // 버퍼를 닫는다
    }
}
