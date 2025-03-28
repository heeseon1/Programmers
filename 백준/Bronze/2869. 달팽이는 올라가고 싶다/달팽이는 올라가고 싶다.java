import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	// 입력
    	String[] inputs = br.readLine().split(" ");
    	int a = Integer.parseInt(inputs[0]);
    	int b = Integer.parseInt(inputs[1]);
    	int v = Integer.parseInt(inputs[2]);
    	
    	// 계산
    	int value = (int) Math.ceil((double)( v - a ) / ( a - b)) + 1;

    	// 출력
    	System.out.println(value);
    	br.close();
    	}
    }