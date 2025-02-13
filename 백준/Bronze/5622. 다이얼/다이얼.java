import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 키 값 정의
		String[] dial = {  "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		int time = 0;

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputs = br.readLine();
		StringBuilder sb = new StringBuilder(inputs);
		
		for ( int i = 0; i < sb.length(); i++) {
			for ( int k = 2; k < dial.length; k++ ) {
				if (dial[k].contains(String.valueOf(sb.charAt(i)))) {
					time = time + ( k + 1);
					break;
				}
			}
		}
		System.out.println(time);
	}
}