class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] s_arr=Integer.toString(x).split("");
        int hashad=0;

        for(int i=0; i<s_arr.length; i++)
            hashad+=Integer.valueOf(s_arr[i]).intValue();
        if(x%hashad==0) return answer;
        else return false;
    }
}