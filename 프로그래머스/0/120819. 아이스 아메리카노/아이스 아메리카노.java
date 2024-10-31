class Solution {
    public int[] solution(int money) {
        int coffee = 5500;
        
        int cup = money / coffee;
        int coin = money % coffee;
        
        int[] answer = {cup, coin};
        
        return answer;
    }
}