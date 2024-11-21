import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args)    throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input;
     
    	while ((input = br.readLine()) != null && !input.isEmpty()) {
    		String[] inputs =input.split(" ");
    		int a = Integer.parseInt(inputs[0]);
    		int b = Integer.parseInt(inputs[1]);
    		
    		int sum = a + b;
    		bw.write(sum+ "\n" );
    	}
    	  bw.flush();
          br.close();
          bw.close();
    }
}