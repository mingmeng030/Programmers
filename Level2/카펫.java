class Solution {
    public int[] solution(int brown, int yellow) {
        int height=0, width = 0;
        
		for (height = 3; height <= (int) (brown + 4) / 2; height++) {
            width = ((brown + 4) / 2) - height;
			if (width < height) break;

			int yCount = (width - 2) * (height - 2);
			if (yellow == yCount) break;
		}
        int[] answer = {width , height};
        return answer;
    }
}