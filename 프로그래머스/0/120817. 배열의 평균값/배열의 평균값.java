class Solution {
    public double solution(int[] numbers) {
        int val = 0;
        double answer = 0;
        
        for (int i=0; i< numbers.length; i++){
            val += numbers[i];
        }
        
        answer = (double)val / numbers.length;

        
        return answer;
    }
}