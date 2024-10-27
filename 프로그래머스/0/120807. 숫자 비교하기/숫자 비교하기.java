class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        //제한사항
        if(num1 < 0 || num1 > 10000){
            System.out.print("숫자는 0~10000까지만 가능합니다.");
                return -1;
        }
        
        
        if(num2 < 0 || num2 > 10000){
            System.out.print("숫자는 0~10000까지만 가능합니다.");
                return -1;
        }
        
        //문제
        if( num1 == num2){
            answer = 1;
                
        }else if( num1 != num2){
            answer = -1;
        }
        
        return answer; 
        
    }
}