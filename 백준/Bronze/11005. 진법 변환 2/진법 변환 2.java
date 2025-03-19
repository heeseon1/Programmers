import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	// 입력
    	String[] inputs = br.readLine().split(" ");
    	int n =Integer.parseInt( inputs[0]);
    	int b = Integer.parseInt(inputs[1]);
    
    	int charValue = 0;
  
    	// 진법 변환 계산
    	while( n > 0) {
    		char ch;  // 초기화
    		
    		charValue = n % b; // 나머지 계산
    		if( charValue < 10) {
    			ch = (char) ('0' + charValue);
    		}else {
    			ch = (char)('A' +( charValue - 10));
    		}
    		sb.append(ch);
    		n = n / b; // 몫 계산
    	}
    	
    	// 출력
    	System.out.println(sb.reverse());
    	br.close();
    }
}