class Solution {
    public int solution(int age) {
         int answer = 0;
         int year = 2022;
        
        //제한사항
        if ( age < 0 || age > 120){
            System.out.print("나이는 1살부터 120살까지 입력할 수 있습니다.");
                return -1;
        }
        
        //문제
        answer = year - age + 1;
        return answer;
    }
}