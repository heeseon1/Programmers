import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] array = new int[9][9];
        int max = 0;
        String value = "";
        
        // 입력
        for ( int i = 0; i < 9; i++) {
        	String [] inputs = br.readLine().split(" ");
        	for ( int k = 0; k <  9; k++) {
        		array[i][k] = Integer.parseInt(inputs[k]);

        		if ( array[i][k] >= max) {
        			max = array[i][k];
        			value = (i+1) + " " + (k+1) ;
        		}
        	}
        }
        // 출력
        System.out.println(max);
        System.out.print(value);
    }
}