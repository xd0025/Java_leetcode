package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt r =new RomanToInt();
        String key = "";
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("add：请输入");
            key =scanner.next();
            switch (key){
                case "add":
                    String str =scanner.next();
                    int x =r.romanToInt(str);
                    System.out.println(x);
                    break;
            }
        }
    }
    Map<Character,Integer> map =new HashMap<Character, Integer>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }
    };
    public  int romanToInt(String s){
        int ans = 0;
        int n = s.length();
        for (int i=0;i<n;++i){
            int value = map.get(s.charAt(i));
            if(i<n-1&&value<map.get(s.charAt(i+1))){
                ans-=value;
            }else {
                ans+=value;
            }

        }
        return ans;
    }
}
