import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t =   Integer.parseInt(br.readLine());
		
		for ( int i = 0; i < t; i++) {
			String input = br.readLine();
			int value = input.length();
			
			char firstValue = input.charAt(0);
			char lastValue = input.charAt(value-1);
			
			bw.write(firstValue +  "" + lastValue + "\n");
		}
		  bw.flush();
          br.close();
          bw.close();
	}
}