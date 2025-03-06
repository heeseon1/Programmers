import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       // 입력
        int number = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i <number; i++) {
        	String inputs = br.readLine();
        	
        // 출력
           boolean [] abc = new boolean[26];
           boolean check = true;
           
           for ( int k = 0; k < inputs.length(); k++) {
        	   char ch = inputs.charAt(k);

        // 연속된 문자일 경우
        	   if ( k > 0 && (inputs.charAt(k) == inputs.charAt(k-1))){
        		   continue;
        	   }
        	   
        // 그룹 단어 X
        	   int idx = inputs.charAt(k) - 'a';
        	   if ( abc[idx] ){
        		   check = false;
        		   break;
        	   }
        	   
         // 그룹 단어 O
        	   abc[idx] = true;
           }
           
           if(check) {
        	   count++;
           }
        }
        System.out.println(count);
    }     
}