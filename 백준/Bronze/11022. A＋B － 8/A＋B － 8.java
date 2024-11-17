import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args)    throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	int t = Integer.parseInt(br.readLine());
    	
    	 for ( int i = 1; i  <=  t;  i++) {
    		 String[] inputs = br.readLine().split(" ");
             int a = Integer.parseInt(inputs[0]);
             int b = Integer.parseInt(inputs[1]);
             int sum = a + b;
             
             bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n" );
	    	}
	    	 bw.flush();
	         bw.close();
}
    }