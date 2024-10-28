class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int value = 1;
        int [] answer = {};

        //제안사항
        if((0 < numer1 && numer1 < 1000) &&(0 < denom1 && denom1 < 1000) 
           &&(0 < numer2 && numer2 < 1000) && (0 < denom2 && denom2 < 1000)){
            
            //분모 계산
            int denom = denom1 * denom2;
            
            //분자 계산
            int numer = numer1 * denom2 + numer2 * denom1;
            
            
            for(int i = 1; i <= denom && i <= numer; i++){
                if (denom % i == 0 && numer % i == 0){
                    value = i;
                }
            }
            
            //기약분수
            denom = denom/value;
            numer = numer/value;
            
            answer = new int[] {numer, denom};
            
        }
        
        return answer;
    }
}