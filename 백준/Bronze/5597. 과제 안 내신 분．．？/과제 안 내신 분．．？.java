import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 30명
		 boolean[] students = new boolean[30];
		
		// 28번 입력받기, 비교하기
		for(int i = 0; i < 28; i++) {
			int value = Integer.parseInt(br.readLine()) -1;
			
			if (value >= 0 && value < 30){
				students[value] = true;
			}
		}
		
        // 출력
		for(int j = 0; j < 30; j++) {
			if (!students[j]) {
				System.out.println( j + 1);
			}
		}	
	}
}
