import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;
		
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
		
		// m만큼 반복하며 바구니 공 바꾸기
		for(int b= 1;b <= m; b++) {
			String[] change = (br.readLine().split(" "));
			int i =  Integer.parseInt(change[0]) -1;
			int j =  Integer.parseInt(change[1]) -1;

			value = arr[i];
			arr[i] = arr[j];
			arr[j] = value;
		}
		
		// 출력 
		for (int v : arr) {
            System.out.print(v + " ");
		}
	}
}
