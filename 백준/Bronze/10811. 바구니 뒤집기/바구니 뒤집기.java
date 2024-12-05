import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫째 줄 입력
		String[] inputs = (br.readLine().split(" "));
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
				
		// n만큼의 바구니 생성
		int arr[] = new int [n];
		
		// n만큼의 바구니에 들어있는 공 번호
		for( int a = 0; a < n; a++) {
			arr[a] = a + 1;
		}
		
		// m만큼 공 바꾸기
		for (int a = 0; a < m; a ++) {
			String[] change = (br.readLine().split(" "));
			int i =  Integer.parseInt(change[0]) -1;
			int j =  Integer.parseInt(change[1]) -1;
			
			for ( int k = j; k > i; k--) {
				int value = arr[i];
				arr[i] = arr[k];
				arr[k] = value;
				i = i + 1;
			}
		}
		
		// 출력 
		for (int v : arr) {
			System.out.print(v + " ");
		}

	}
}
