import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args)    throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	 for ( int i = 1; i  <=  n;  i ++) {
	    		 for(int j = n; j  >  i;  j--) {
	    			 System.out.print(" ");
	    		 }
	    		for(int s = 1; s  <=  i; s++) {
	    			 System.out.print("*");
	    		}
	    		 System.out.println();
	    	}
}
    }