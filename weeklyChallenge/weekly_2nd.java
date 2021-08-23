class Solution {
        public static String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();
        int len=scores.length;

        for(int i=0; i<len; i++){
            double min=101, max=0, tempTotal=0, div=len;
            for(int j=0; j<len; j++) {
                int tempScore = scores[j][i];
                if (i != j) {
                    max = Math.max(max, scores[j][i]);
                    min = Math.min(min, scores[j][i]);
                }
                tempTotal += tempScore;
            }
            if(scores[i][i]>max||scores[i][i]<min){
                tempTotal-=scores[i][i];
                div--;
            }
            double resultScore =tempTotal/div;
            sb.append(resultScore >= 90 ? "A" : resultScore >= 80 ? "B" : resultScore >= 70 ? "C" : resultScore >= 50 ? "D" : "F" );
        }
        return sb.toString();
    }
}