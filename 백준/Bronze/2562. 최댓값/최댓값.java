import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = 0;
		int [] listValue = new int [9];
        int max = Integer.MIN_VALUE;
		 
		for(int i = 0; i  < 9; i++) {
			int inputs = Integer.parseInt(br.readLine());
			listValue[i] = inputs;
		}
		
		for (int i = 0;  i  <  9;  i++) {
			if(listValue[i] >  max){
				max = listValue[i];
				num = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}
}