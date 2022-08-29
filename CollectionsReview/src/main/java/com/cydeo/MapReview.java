package com.cydeo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
// create hashmap
        Map<Integer, String> mapStudents = new HashMap<>();
        mapStudents.put(1,"Abby");//finding through key is constant O(1), iteration O(n)
        mapStudents.put(2,"Bobby");//99% we use HashMap with array problems
        mapStudents.put(3,"Clara");
        mapStudents.put(4,"Debora");

        String str="Java Developer";
        System.out.println(findFirstNonRepeating(str));

    }
    public static Character findFirstNonRepeating(String str){
        // create a map, space complexity
Map<Character,Integer> map=new HashMap<>();
// crate counter of frequency
int count=0;
//iterate and check frequency 1
        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
                count=map.get(ch);// we get the current count
                map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Character ch: str.toCharArray()){
            if(map.get(ch)==1){
                return ch;
            }
        }
        return null;
    }
}
