import java.util.Arrays;
import java.util.Comparator;
 
class Solution {
    public String solution(int[] numbers) {
        String answer = "";        
        String[] sarr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) 
            sarr[i] = (String.valueOf(numbers[i]));
        
        Arrays.sort(sarr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        if (sarr[0].equals("0")) return "0";
        
        for (int i = 0; i < sarr.length; i++)
            answer+=sarr[i];
        
        return answer;
    }
}