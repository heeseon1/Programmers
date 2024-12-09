import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫째 줄 입력
		int n = Integer.parseInt(br.readLine());
		
		// 둘째 줄 입력
		String[] inputs = br.readLine().split(" ");
		int max = Integer.parseInt(inputs[0]);
		
		// 최대값  점수 구하기
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(inputs[i]);
			
			if ( value > max) {
				max = value;
			}
		}
		
		// 평균 구하기
		double sum = 0.0;
		
		for (int j = 0; j < inputs.length; j++) {
			int num = Integer.parseInt(inputs[j]);
			sum = sum +  ((double) num / max) * 100;
		}
		   double avg = sum / n;
		   System.out.println(avg);
	}
}