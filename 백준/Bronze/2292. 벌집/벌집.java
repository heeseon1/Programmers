import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int num = 1;
    	int roomCount;

    	// 입력
    	int n = Integer.parseInt(br.readLine());
    	
    	// 계산
    	for (roomCount = 1; num  < n; roomCount++) {
    		num  = 6 * roomCount + num;
    	}
    			
    	// 출력
    	System.out.println(roomCount);
    	br.close();
    	}
    }