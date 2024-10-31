class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i <=6 && i<=n; i++){
            if( 6 % i == 0 && n % i == 0){
                answer = ((6 * n) / i) / 6;
            }
        }
        
        return answer;
    }
}