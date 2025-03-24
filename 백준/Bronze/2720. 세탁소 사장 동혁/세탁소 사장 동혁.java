import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	// 입력
    	int t = Integer.parseInt(br.readLine());
    	int[] coins = {25, 10, 5, 1};
    	
    	for (int i = 0; i < t; i++) {
    		int c = Integer.parseInt(br.readLine());
    		StringBuilder sb = new StringBuilder();
    		
    		for (int coin: coins) {
    			sb.append( c / coin).append(" ");
    			c %= coin;
    		}
    		sb.append("\n");
    		bw.write(sb.toString());
    	}
    	
    	// 출력
		bw.flush();
    	br.close();
    	bw.close();
    	}
    }