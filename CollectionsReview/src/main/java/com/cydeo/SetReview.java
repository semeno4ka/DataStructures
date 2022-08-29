package com.cydeo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
      Set<Student> set=new LinkedHashSet<>();
        set.add(new Student(1, "Annie"));
        set.add(new Student(2, "Bob"));
        set.add(new Student(3, "Claire"));
        set.add(new Student(4, "Diana")); // ALWAYS IMPLEMENT HASHCODE IN HASH DATA STRUCTURES
        set.add(new Student(4, "Diana"));// will add duplicate if hashcode is not implemented in Student class
     //   System.out.println(set.add(new Student(1, "Annie")));//false

        System.out.println(set);
        System.out.println("                       First Repeating Char");
    //    String str="Java Developer";
      //  System.out.println(firstRepeatingChar(str));

        // 2 add element



    }
    public static Character firstRepeatingChar(String str){
        Set<Character> setChar=new HashSet<>();// costed extra space allocation. Space complexity O(n)
        for(Character ch: str.toCharArray()){// O(n) time complexity
            if(!(setChar.add(ch))){// better to create new Object(Space complexity), than increase time complexity
                return ch;
            }
        }
        return null;
    }
}
