class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice=(price*count*((long)count+1))/2;
        return (money>=totalPrice) ? 0 : totalPrice - money;
    }
}