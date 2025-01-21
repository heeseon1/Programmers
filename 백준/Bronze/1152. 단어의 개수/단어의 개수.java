import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String inputs = br.readLine().trim();
    	
    	if(inputs.isEmpty()) {
    		System.out.print(0);
    		return;
    	}
    	String[] words = inputs.split(" ");
    	int value = words.length;
   
    	 System.out.print(value);
	}  
}