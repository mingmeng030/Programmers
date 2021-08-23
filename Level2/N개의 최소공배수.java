import java.util.Arrays;

class Solution {
    public  int solution(int[] arr) {
        Arrays.sort(arr); //배열 정렬
        // 최소공배수 = 두 수의 곱 / 최대공약수
	    int lcm = arr[0] * arr[1] / gcd(arr[0], arr[1]);
	
        //[i-1],[i]의 최소공배수와 [i+1]의 최소공배수를 찾기
        for (int i = 2; i < arr.length; i++) 
		lcm = lcm * arr[i] / gcd(lcm, arr[i]);
		
        return lcm;
    }
	
    public static int gcd(int small, int big) {
        while (small != 0) {
            int temp = big % small;
            big = small;
            small = temp;
        }
        return big;
    }
}