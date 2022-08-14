package test;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class test2 {
//    public static void main(String[] args) throws IOException{
//        System.out.print(solution());
//    }
    public String[] solution(int n, String[] queries) {
        ArrayList<String> answer = new ArrayList<String>();
        String[][] ipArr = new String[n][2];
        String availableIp = "192.168.0.";
        for(int i=0; i<n; i++){
            ipArr[i][0]=availableIp+(i+1);
            ipArr[i][1]="0";

        }

        int nowIpIndex=0;
        HashMap<String, String> requestMap = new HashMap<String,String>();
        for(int i=0; i<queries.length; i++){
            String [] splitedArr = queries[i].split(" ");
            String name = splitedArr[0];
            String ask = splitedArr[1];

            int usedId=0;

            if(ask.equals("request")){
                if(usedId==n){
                    answer.add(name+" reject");
                }
                else if(ipArr[nowIpIndex][1]=="0"){
                    requestMap.put(name,ipArr[nowIpIndex][0]);
                    ipArr[nowIpIndex][1]="1";
                    answer.add(name+" "+ipArr[nowIpIndex][0]);

                    nowIpIndex++;
                    usedId++;
                }
                else if(ipArr[nowIpIndex][1]!="0"){
                    for(int j=1; j<=n; j++){
                        if(ipArr[j][1]=="0") {
                            nowIpIndex=j;

                            requestMap.put(name,ipArr[nowIpIndex][0]);
                            ipArr[nowIpIndex][1]="1";
                            answer.add(name+" "+ipArr[nowIpIndex][0]);

                            usedId++;
                        }
                    }
                }

            }
            else if(ask.equals("release")){
                String releaseIp = requestMap.get(name);
                String[] splitedIp = releaseIp.split(".");
                int idx = Integer.parseInt(splitedIp[splitedIp.length-1]);
                ipArr[idx][1] = "0";
                usedId--;
            }
            nowIpIndex%=n;
        }
        String[] result = new String[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i]=answer.get(i);
        }
        return result;
    }
}



