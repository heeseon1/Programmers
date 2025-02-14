import java.io.BufferedReader;     
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> inputs = new ArrayList<>();
		
		while(true){
		String lineInput = br.readLine();
		
			// 빈 줄 제한
			if (lineInput == null || lineInput.isEmpty()) {
				break;
			}
			// 앞 뒤 공백 제거
			String value = lineInput.trim();
			
			// 100줄 이상이면 종료
			if (inputs.size() >= 100) {
				break;
			}
			
			// 입력 제한
			if (!value.matches("[a-zA-Z0-9 ]+")) {
				continue;
			}
			inputs.add(value);
		}
		
		// 출력
		for(String input : inputs) {
			System.out.println(input);
		}
	}
}