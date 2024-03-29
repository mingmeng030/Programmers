import java.util.*;
class Solution {
    	public int solution(int[] nums) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
        
		for(int i=1; i<nums.length; i++) // nums[] 배열의 중복제거 : 포켓몬 종류
			if(!list.contains(nums[i]))
				list.add(nums[i]);
        
		/* list.size(): 포켓몬의 종류, nums.length: 가질 수 있는 포켓몬의 수 */
		answer = (nums.length/2>=list.size() ) ? list.size() : nums.length/2;
		return answer;
	}
}