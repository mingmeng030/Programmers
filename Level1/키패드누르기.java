class Solution {
    public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int left=10, right=12;
		int LDistance, RDistance;
        
		for(int n : numbers) {
			LDistance = 0; RDistance = 0;
			if(n == 1 || n == 4 || n == 7) {
				sb.append("L");
				left = n;
			
			}
			else if(n == 3 || n == 6 || n == 9) {
				sb.append("R");
				right = n;
			}
			else {
				if(n==0) n += 11;
					LDistance = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
					RDistance = (Math.abs(right-n))/3 + (Math.abs(right-n))%3;
				if(LDistance == RDistance) {
					if(hand.equals("right")) {
						sb.append("R");
						right = n;
					}
					else {
						sb.append("L");
						left = n;
					}
				}
				else if(LDistance > RDistance) {
					sb.append("R");
					right = n;
				}
				else {
					sb.append("L");
					left = n;
				}
			}
		}	
	return sb.toString();
    }
}