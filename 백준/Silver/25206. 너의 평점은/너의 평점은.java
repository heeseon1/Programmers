import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 과목 평점 표
        Map<String, Double> map =  Map.of(
        		 "A+", 4.5, "A0", 4.0,
        		 "B+", 3.5, "B0", 3.0,
        		 "C+", 2.5, "C0", 2.0,
        		 "D+", 1.5, "D0", 1.0,
        		 "F", 0.0
        		 );
        
        double units = 0.0;
        double total = 0.0;
        
        for (int i = 0;  i  < 20;  i++) {
        	String[] inputs = br.readLine().split(" ");  // 입력
        	
        	if(inputs[2] .equals("P")) {
        		continue;
        	}
        	
        	double unit = Double.parseDouble(inputs[1]); // 학점
        	double grade = map.get(inputs[2]);           // 성적
        	
        	units += unit;                               // 총학점
        	total += (unit * grade);                     // 총 학점X성적
	           }
        
        double avg = total / units;                      // 평균 계산
        System.out.printf("%.6f\n", avg);                // 출력
    }
}