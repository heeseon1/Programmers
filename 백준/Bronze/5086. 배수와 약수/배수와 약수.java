import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 
public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	List<String> value = new ArrayList<>();

    	while(true) {
        	// 입력 (빈 줄 확인)
    		String line = br.readLine();
    		
    		if (line == null || line.trim().isEmpty()) {
    	        continue;
    	    }
    		 
    		String[] inputs = line.split(" ");
        	int a = Integer.parseInt(inputs[0]);
        	int b = Integer.parseInt(inputs[1]);
        
        	// 마지막 줄
        	if( a == 0 & b == 0) {
        		break;
        	}
        	
        	if ( b % a == 0) {
        		value.add("factor");
        	}else if(a % b == 0){
        		value.add("multiple");
        	}else {
        		value.add("neither");
        	}
    	}
    	
    	// 출력
    	for(String v: value) {
    		System.out.println(v);
    	}
    	br.close();
    	}
    }