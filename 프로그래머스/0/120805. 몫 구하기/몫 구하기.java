class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        //제한사항
        if ((num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <= 100)){
            answer = num1 / num2;
        }else{
            System.out.print("숫자는 0~100까지 입력해주세요.");
        }
        
        return answer;
    }
}