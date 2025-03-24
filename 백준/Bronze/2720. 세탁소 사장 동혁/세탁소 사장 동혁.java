import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	// 입력
    	int t = Integer.parseInt(br.readLine());
    	
    	for( int i = 0; i < t; i++) {
    		int c = Integer.parseInt(br.readLine());
    		
    		int quarter = c / 25;
    		c %= 25;
    		
    		int dime = c / 10;
    		c %= 10;
    		
    		int nickel = c / 5;
    		c %= 5;
    		
    		int penny = c;
    		
    		String value = quarter + " " + dime + " " + nickel + " " + penny + "\n";
    		bw.write(value);
    		}
    	
    	// 출력
		bw.flush();
    	br.close();
    	bw.close();
    	}
    }