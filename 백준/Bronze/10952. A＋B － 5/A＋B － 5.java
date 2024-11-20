import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args)    throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
    	while (true) {
    		String[] inputs = br.readLine().split(" ");
    		int a = Integer.parseInt(inputs[0]);
    		int b = Integer.parseInt(inputs[1]);
    	
    		if( a==0 && b==0) {
    			break;
    		}
    		int sum = a + b;
    		bw.write(sum+ "\n" );
    	}
    	bw.flush();
    }
}
 
