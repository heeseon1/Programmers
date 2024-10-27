class Solution {
    public int solution(int num1, int num2) {
        int value = num1 % num2;
        return value;
    }


  public static void main(String[] args) {
      Solution sol = new Solution();
      System.out.println(sol.solution(3,2));
      System.out.println(sol.solution(5,10));
  }
}