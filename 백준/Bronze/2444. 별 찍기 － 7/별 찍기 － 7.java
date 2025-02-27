import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());

        // 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(2 * i - 1));
        	System.out.println();
        }

        for ( int j = n-1; j >= 1; j--) {
        	 System.out.print(" ".repeat(n-j));
             System.out.print("*".repeat(2 * j - 1));
         	System.out.println();
        }
    }
}