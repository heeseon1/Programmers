import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean tf = true;

        // 입력
        String input = br.readLine();
        
        for (int i = 0; i < input.length(); i++) {
        	char front = input.charAt(i);
        	char back = input.charAt(input.length() - i - 1);
        	
        	if( front != back) {
        		tf = false;
        		break;
        	}
        } 
        // 출력
        if(tf) {
    		System.out.println("1");
    	}else {
    		System.out.println("0");
    	}
    }     
}