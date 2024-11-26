import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] inputs =br.readLine().split(" ");
		
		int max =  Integer. parseInt(inputs[0]);
		int min =  Integer. parseInt(inputs[0]);
		
		for (int i = 0;  i  <  n;  i++) {
			int value = Integer. parseInt(inputs[i]);
			
			if( value >  max) {
				max = value;
			} else if ( value < min ) {
				min = value;
			}
		}
		System.out.println(min + " " + max);
	}
}