class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer("");
        int result=0;
        while(n>0){
            sb.insert(0,n%3);
            n/=3;
        }
        sb.reverse();
        for(int i=0; i<sb.length(); i++){
            String temp = sb.substring(i,i+1);
            if(temp=="1") continue;
            else
                result += Integer.parseInt(temp)*(int)Math.pow(3, sb.length()-(i+1));    
        }
        return result;
    }
}