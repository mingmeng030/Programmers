import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arrlist = new ArrayList<Integer>();

	for (int i = 0; i < numbers.length - 1; i++) {
		for (int j = i + 1; j < numbers.length; j++) {
			int addnum = numbers[i] + numbers[j];
			if (arrlist.indexOf(addnum) < 0)
				arrlist.add(addnum);
		}
	}

	int[] answer = new int[arrlist.size()];

	for (int i = 0; i < arrlist.size(); i++) 
		answer[i] = arrlist.get(i);

	Arrays.sort(answer);
	
	return answer;
    }
}