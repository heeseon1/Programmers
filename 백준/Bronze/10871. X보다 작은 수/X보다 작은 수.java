import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] number =br.readLine().split(" ");
		int n = Integer.parseInt(number[0]);
		int x =  Integer.parseInt(number[1]);
		
		StringBuilder str = new StringBuilder ();
		String[] inputs =br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			int value = Integer. parseInt(inputs[i]);
			if( value < x) {
				str.append(value).append(" ");
			}
		}
		System.out.println(str.toString().trim());
	}
}