import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        // 체스 값
		int chess [] = {1, 1, 2, 2, 2, 8};
        // 입력 값
		String[] inputs = br.readLine().split(" ");
		int[] intInputs = new int[inputs.length];
		
		for (int i = 0; i < inputs.length; i++) {
            // 형 변환
			intInputs[i] = Integer.parseInt(inputs[i]);
            
			if ( intInputs[i] == chess[i]) {
				intInputs[i] = 0;
			}else if( intInputs[i] == 0){
				intInputs[i] = chess[i];
			}else{
				intInputs[i] = chess[i] - intInputs[i];
			}
		}
        // 출력 값
		for(int  k = 0; k < intInputs.length; k++) {
			System.out.print(intInputs[k] + " ");
		}
	}
}