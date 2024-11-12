import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args)    throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	int n = Integer.parseInt(br.readLine());
    	 int arr[] = new int[n];
    	
    	 for ( int i =0; i  <  n; i ++) {
    		 String[] inputs = br.readLine().split(" ");
             int a = Integer.parseInt(inputs[0]);
             int b = Integer.parseInt(inputs[1]);
	    	arr[i] =   a + b;
	    	}
	       
	    	 for(int j : arr) {
	    		  bw.write(j + "\n");
    }
	    	 
	    	 bw.flush();
	         bw.close();
}
    }
