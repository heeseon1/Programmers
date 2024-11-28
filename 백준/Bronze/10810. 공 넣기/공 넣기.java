import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//첫째 줄 입력
		String[] cartball = (br.readLine().split(" "));
		int n = Integer.parseInt(cartball[0]);
		int m = Integer.parseInt(cartball[1]);
		
		int [] value = new int[n];
		
		for(int a = 1; a <= m; a++) {
			//둘째 줄 입력
			String[] inputs =  (br.readLine().split(" "));
			int i =  Integer.parseInt(inputs[0]);
			int j=  Integer.parseInt(inputs[1]);
			int k =  Integer.parseInt(inputs[2]);

				for(int b = i; b <=j; b++) {
					value[b-1] = k;
				}
		}
		for(int c = 0; c  < n; c++) {
			System.out.print(value[c] + " ");
			}
	}
}