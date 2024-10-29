import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxcnt = 0;
        
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int num :array){ // (배열 요소 : 배열) -> 배열의 요소를 순서대로 반복
            // map.getOrDefault(키값, 설정값): 키값이 존재하면 키값으로, 키값이 존재하지 않으면 설정값으로 설정하는 메서드
            map.put(num, map.getOrDefault(num,0) +1); 

            // map.get(키): 특정 키에 해당하는 값을 가져오는 메서드
            // map(num, value)으로 저장되어 있으므로 해당 num의 value값을 count에 저장 (value: 각 num의 빈도값)
            int count = map.get(num);

                // 반복문 안에서 count, maxcnt 값을 비고하며 maxcnt 값 계속 갱신
                if(count > maxcnt){
                    maxcnt = count;
                    answer = num;
                    
                // 최빈값이 여러개 일 때 -1 반환
                }else if(count == maxcnt){
                    answer = -1;
                }
        }
        
        
        return answer;
    }
}
