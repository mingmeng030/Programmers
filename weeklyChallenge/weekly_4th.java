import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

class Solution {
    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        String[][] tempTable=new String[5][6];
        HashMap<String, Integer>[] mapTable=new HashMap[5];
        int[] result=new int[5];

        for(int i=0; i<5; i++)
            tempTable[i] = table[i].split(" ");


        for(int i=0; i<5; i++){
            mapTable[i]=new HashMap<>();
            System.out.print(tempTable[i][0]+" : ");
            for(int j=1; j<6; j++){
                mapTable[i].put(tempTable[i][j],6-j);
                System.out.print(tempTable[i][j]+" "+(6-j)+" ");
            }
            System.out.println();
        }

        int maxResultIndex=0;

        for(int i=0; i<5; i++){
            for(int j=0; j<languages.length; j++){
                if(mapTable[i].containsKey(languages[j]))
                    result[i]+=mapTable[i].get(languages[j])*preference[j];
                else result[i]+=0;
            }
            System.out.print(result[i]+" ");
            if(result[i]>result[maxResultIndex]) maxResultIndex=i;
        }
        
        for(int i=0; i<5; i++){
            if(result[i]==result[maxResultIndex]){
                int compare=tempTable[i][0].compareTo(tempTable[maxResultIndex][0]);
                if(compare<0) maxResultIndex=i;
            }
        }

        return tempTable[maxResultIndex][0];
    }
}