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
    	 int arr[] = new int[t];
    	 int arra[] = new int[t];
    	 int arrb[] = new int[t];
    	
    	 for ( int i =0; i  <  t;  i ++) {
    		 String[] inputs = br.readLine().split(" ");
             int a = Integer.parseInt(inputs[0]);
             int b = Integer.parseInt(inputs[1]);
	    	arr[i] =   a + b;
	    	arra[i] = a;
	    	arrb[i] = b;
	    	}
	       
    	 	for(int j = 0; j < t; j++) {
    	 		bw.write("Case #" + ( j+1) + ": " + arra[j] + " + " + arrb[j] + " = " + arr[j] + "\n" );
    	 	}

	    	 bw.flush();
	         bw.close();
}
    }