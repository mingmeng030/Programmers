class Solution {
    public long solution(long n) {
        double answer = Math.sqrt(n);
        int temp=(int)Math.sqrt(n);
        if(temp<answer) return -1;
        else return (long)Math.pow(++answer, 2);
    }
}