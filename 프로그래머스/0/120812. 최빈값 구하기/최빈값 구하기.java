import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxcnt = 0;
        
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int num :array){
            map.put(num, map.getOrDefault(num,0) +1);
            
            int count = map.get(num);
            
                if(count > maxcnt){
                    maxcnt = count;
                    answer = num;
                }else if(count == maxcnt){
                    answer = -1;
                }
        }
        
        
        return answer;
    }
}