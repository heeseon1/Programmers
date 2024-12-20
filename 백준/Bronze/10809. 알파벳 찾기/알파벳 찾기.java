import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  s = br.readLine() ;
		
		int[] abc = new int[26];
		Arrays.fill(abc, -1);
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int value = c - 'a';
			
			if(abc[value] == -1) {
				abc[value] = i;
			}
		}
		 for (int i = 0; i < abc.length; i++) {
	            System.out.print(abc[i] + " ");
	        }
	}
}