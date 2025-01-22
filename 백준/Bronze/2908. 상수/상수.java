import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputs = br.readLine();
		StringBuilder sb = new StringBuilder(inputs);
		String ab = sb.reverse().toString();
		
		String [] value = ab.split(" ");
		
		int a = Integer.parseInt(value[0]);
		int b = Integer.parseInt(value[1]);
		
		if ( a > b ) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}	
	}
}