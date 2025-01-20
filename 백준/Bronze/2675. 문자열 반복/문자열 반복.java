import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    	int testCase = Integer.parseInt(br.readLine());
    	StringBuilder output = new StringBuilder();
    	
    	for (int i = 0; i < testCase; i++) {
    		String[] inputs = br.readLine().split(" ");
    		int n = Integer.parseInt(inputs[0]);
    		String s = inputs[1];
    		
    		StringBuilder result = new StringBuilder();
    		
    		for ( int j = 0; j < s.length(); j++) {
    			for ( int k = 0; k < n; k++) {
    				result.append(s.charAt(j));
    			}
    		}
    		 output.append(result).append("\n");
    	}
    	 System.out.print(output.toString());
	}  
}