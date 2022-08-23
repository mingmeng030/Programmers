import java.util.*;
static public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        int[] numArr= new int[10];
        int count= 0;

        for (int i = 0; i < X.length(); i++) 
            xArr[(X.charAt(i) - '0')]++;

        for (int i = 0; i < Y.length(); i++) 
            yArr[(Y.charAt(i) - '0')]++;
        
        for (int i = 0; i < 10; i++) {
            while xArr[i] != 0 && yArr[i] != 0){
                count++; 
                numArr[i]++;
                xArr[i]--;
                yArr[i]--;
            }
        }

        if(count == 0) return "-1";

        while (count > 0) {
            for (int i = 9; i >= 0; i--) {
                if(numArr[i] != 0){
                    answer.append(String.valueOf(i));
                    numArr[i]--; 
                    break;
                }
            }
            count--;
        }
        if(answer.toString().split("0").length == 0) return "0";
        
        return answer.toString();
    }