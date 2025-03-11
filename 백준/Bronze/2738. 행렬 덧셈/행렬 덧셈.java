import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// n, m 입력
    	String[] inputs = br.readLine().split(" ");
    	int n = Integer.parseInt(inputs[0]);
    	int m = Integer.parseInt(inputs[1]);
    	
    	// a, b 행렬 선언
    	int[][] a = new int [n][m];
    	int[][] b = new int [n][m];
    	int[][] sum = new int [n][m];
    	
    	// a 행렬 입력
    	for ( int i = 0; i < n; i++) {
    		String[] arrays = br.readLine().split(" ");
    		for ( int k = 0; k < m; k++) {
    			a[i][k] = Integer.parseInt(arrays[k]);
    		}
    	}
    	
    	// b 행렬 입력
    	for ( int i = 0; i < n; i++) {
    		String[] arrays = br.readLine().split(" ");
    		for ( int k = 0; k < m; k++) {
    			b[i][k] = Integer.parseInt(arrays[k]);
    			sum[i][k] = a[i][k] + b[i][k];
    		}
    	}
    	
    	// 출력
    	for( int i = 0; i < n; i++) {
    		for ( int k = 0; k < m; k++) {
    			System.out.print(sum[i][k] + " ");
    		}
    		System.out.println();
    	}	
	}  
}