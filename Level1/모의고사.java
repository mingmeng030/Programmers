import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
        int[] temp = {0,0,0};
        int[] one={1,2,3,4,5};
        int[] two={2,1,2,3,2,4,2,5};
        int[] three={3,3,1,1,2,2,4,4,5,5};
        int max=0, count=3;
        
        for(int i=0; i<answers.length; i++){
				if (answers[i] == one[i % 5]) temp[0]++;
				
                if (answers[i] == two[i % 8]) temp[1]++;
				
                if (answers[i] == three[i % 10]) temp[2]++;
        }

        max=(temp[0]>=temp[1])? temp[0] : temp[1];
        max=(max>=temp[2])? max : temp[2];
        
        if (max == 0) 
			return new int[] {};
		
		List<Integer> winner = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			if (temp[i] == max) 
				winner.add(i);
		}

		// 최종 배열 생성 및 정렬 후 리턴
		int size = winner.size();
		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			answer[i] = winner.get(i) + 1;
		}
		Arrays.sort(answer);

		return answer;
	}
}