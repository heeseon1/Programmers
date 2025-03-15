import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// 도화지 생성
    	int[][] paper = new int [100][100];
    	int extent = 0;
    	
    	// 색종이 수 입력
    	int n = Integer.parseInt(br.readLine());
    	
    	// 입력
    	for(int i = 0; i < n; i++) {
    		String[] xy = br.readLine().split(" ");
    		int x = Integer.parseInt(xy[0]);
    		int y = Integer.parseInt(xy[1]);
    		
    		for(int k = x; k < x+10; k++ ) {
    			for(int j = y; j < y+10; j++) {
    				paper[j][k] = 1;
    			}
    		}
    	}
	
    	//출력
    	for (int i = 0; i < 100; i++) {
    		for(int k = 0; k < 100; k++) {
    			if (paper[i][k] == 1) {
    				extent ++;
    			}
    		}
    	}
    	System.out.println(extent);
    }
}
 