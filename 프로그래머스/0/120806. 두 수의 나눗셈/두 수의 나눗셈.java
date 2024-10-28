class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        double value = 0;
        
        //제안사항
        if ((num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <=100)){
            value = (double) num1 / num2;
            answer = value * 1000;
        }else{
            System.out.print("숫자는 1~100까지 입력할 수 있습니다.");
        }
        
        
        return (int) answer;
    }
}