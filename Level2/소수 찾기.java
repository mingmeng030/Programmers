import java.util.HashSet;
class Solution {
    static HashSet<Integer> set= new HashSet<>(); //중복없이 저장, count
    static char[] carr;
    static boolean[] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        carr= new char[numbers.length()];
        visited= new boolean[numbers.length()];
        
        for(int i=0; i<numbers.length(); i++)
            carr[i]=numbers.charAt(i);
        
        recursion("", 0);
        
        answer= set.size();
        return answer;
    }
    
    public void recursion(String str, int idx){
        int num;
        if(str!="") {
            num= Integer.parseInt(str);
            if(isPrime(num)) set.add(num); //소수이면 set에 추가
        }
        
        if(idx== carr.length) return;
        
        for(int i=0; i<carr.length; i++){
            if(visited[i]) continue;
            visited[i]= true;
            recursion(str+carr[i], idx+1);
            visited[i]= false;
        }
    }
    
    public boolean isPrime(int num){ //소수 판별
        if(num==1||num==0) return false;
        for(int i=2; i<=Math.sqrt(num); i++)
            if(num%i==0) return false;
        
        return true;
    }
}