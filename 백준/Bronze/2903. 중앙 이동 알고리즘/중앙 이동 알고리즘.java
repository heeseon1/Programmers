import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int point = 1;

    	// 입력
    	int n = Integer.parseInt(br.readLine());
    	
    	// 계산
    	for (int i = 0; i < n; i++) {
    		point *= 2;
    	}
    	point += 1;
    	point *= point;
    	
    	// 출력
    	System.out.println(point);
    	br.close();
    	}
    }