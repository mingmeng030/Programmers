import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[][] sizes) {
        ArrayList<Integer> bigger = new ArrayList<>();
        ArrayList<Integer> smaller = new ArrayList<>();
        for(int i=0; i<sizes.length;i++){
            if(sizes[i][0]>=sizes[i][1]){
                bigger.add(sizes[i][0]);
                smaller.add(sizes[i][1]);
            }
            else{
                bigger.add(sizes[i][1]);
                smaller.add(sizes[i][0]);
            }
        }
        int max = Collections.max(bigger);
        int min = Collections.max(smaller);

        return max*min;
    }
}