class Solution {
    public int solution(int price) {
        double value = 0;
        
        if (price >=500000){
             value = price * 0.2;
        }else if( price >= 300000){
             value = price * 0.1;
        }else if( price >= 100000){
             value = price * 0.05;
        }
            
        int answer = price - (int)Math.round(value);
        return answer;
    }
}