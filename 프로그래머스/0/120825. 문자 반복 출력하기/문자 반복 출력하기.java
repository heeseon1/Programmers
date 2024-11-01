class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for( int i = 0; i <= my_string.length() - 1; i++ ){
            char value = my_string.charAt(i);
            
            for (int j = 0; j < n; j++)
                sb.append(value);
                answer = sb.toString();
        }
        return answer;
    }
}