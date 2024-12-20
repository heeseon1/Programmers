import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  Set<Integer> inputs = new HashSet<>(); 
		
		 for(int i = 0; i < 10; i++) {
				int value = Integer.parseInt(br.readLine());
				inputs.add(value % 42);
			}
		 
		 System.out.println(inputs.size());
	}
}