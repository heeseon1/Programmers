class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        
        if ((num1 >= -50000 && num1 <= 50000) && (num2 >= -50000 && num2 <= 50000)){
            answer = num1 + num2;
        }else{
            System.out.print("숫자는 -50000~50000까지 입력 가능합니다.");
        }
        
        return answer;
    }
}