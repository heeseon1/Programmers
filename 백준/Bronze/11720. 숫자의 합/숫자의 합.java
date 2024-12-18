import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int  n = Integer.parseInt(br.readLine()) ;
		String num = br.readLine();
		int hap = 0;
	
		for( int i =  0; i < n; i++) {
			int value = num.charAt(i) - '0';
			hap += value;
		}
		System.out.println(hap);
	}
}