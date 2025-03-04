import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력
        String input = br.readLine().toUpperCase();
        int [] count = new int[26];
        int max = 0;
        char output = '?';
        		
        for (int i = 0; i < input.length(); i++) {
        	char ch = input.charAt(i);
        	count [ ch - 'A']++;
        }
        
        // 출력
        for (int j = 0; j < count.length; j++) {
        	if (count[j] > max) {
        		max = count[j];
        		output = (char) (j + 'A');
        	}else if ( count[j] == max) {
        		output = '?';
        	}
        }
        System.out.println(output);
    }     
}