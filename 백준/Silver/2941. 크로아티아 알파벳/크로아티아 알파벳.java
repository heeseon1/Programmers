import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력
        String input = br.readLine();
        String[] words = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int count = 0;

        // 출력
        for (String word : words) {
        	while (input.contains(word)){
        		count++;
        		input = input.replaceFirst(word, " ");
        	}
        }
        
        input = input.replace(" ", "");
        count = count + input.length();
        
        System.out.println(count);
    }     
}