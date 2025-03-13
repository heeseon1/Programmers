import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char arrays[][] = new char[5][15];
		
		// 입력
    	for (int i = 0; i < 5; i++) {
			String inputs = br.readLine();
    		for (int k = 0; k < inputs.length(); k++) {
    			arrays[i][k] = inputs.charAt(k);
    		}
    	}
    	// 출력
    	for(int i = 0; i < 15; i++) {
    		for(int k = 0; k < 5; k++) {
    			if ( arrays[k][i] != '\u0000') {
    				bw.write(arrays[k][i]);
    			}
    		}
    	}
    	bw.flush();
    	br.close();
    	bw.close();
    }
}