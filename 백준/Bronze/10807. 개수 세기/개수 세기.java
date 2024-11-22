import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)    throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    		int n = Integer.parseInt(br.readLine());
    		int num[] = new int[n];
    		String[] inputs =br.readLine().split(" ");
    		int total = 0;
    		
    		for ( int i = 0; i  < n; i++ ) {
    			num[i] = Integer.parseInt(inputs[i]);
    		}
    		
    		int v = Integer.parseInt(br.readLine());
    		
    		for ( int j = 0; j < n; j++) {
    			if( num[j] == v) {
    				total +=  1;
    			}
    		}
    	System.out.println(total);
        br.close();
    }
}