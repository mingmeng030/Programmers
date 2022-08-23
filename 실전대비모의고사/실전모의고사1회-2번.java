import java.util.*; 
static public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantedMap = new HashMap<String, Integer>();

        for (int i = 0; i < want.length; i++) 
           wantedMap.put(want[i], number[i]);

        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> discountMap = new HashMap<String, Integer>();
            int count = 0;

            for (int j = i; j < i + 10; j++) 
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            
            for (String s : want ) {
                if(wantedMap.get(s) == discountMap.get(s)) count++;
                else break;
            }

            if (count == want.length) answer++;
        }
        return answer;
    }