import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// 입력
    	String[] inputs = br.readLine().split(" ");
    	String n = inputs[0];
    	int b = Integer.parseInt(inputs[1]);
    	
    	// 진법 변환
    	int value = Integer.parseInt(n, b);
    	
    	//출력
    	System.out.print(value);
    }
}
 