import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        //오름차순 정렬
        Arrays.sort(array);
        
        // 길이 홀수
        if (array.length % 2 == 0){
            System.out.print("배열의 길이는 홀수여야 합니다.");
        }else{
             answer = array[array.length / 2];
        }
        
        
        return answer;
    }
}