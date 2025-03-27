import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int line = 1;
    	int sum = 0, num = 0;
    	int x = 0;
    	int y = 0;

    	// 입력
    	int n = Integer.parseInt(br.readLine());
    	
    	// 계산
    	for (int i = 1;  sum < n; i++) {
    		sum += i;                        // 누적 합
    		line = i ;                          // 대각선 줄
    		num = n - (sum - i);     // 대각선 줄에서 몇 번째인지
    	}
    	
    	// 홀짝 구별
    	if( line % 2 == 0) {
    		 x = 0 + num;
    		 y = line - num + 1;
    	}else{
    		 x = line - num + 1;
    		 y = 0 + num;
    	}
			
    	// 출력
    	System.out.println(x + "/" + y);
    	br.close();
    	}
    }