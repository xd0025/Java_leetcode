package com.practice;

import java.util.*;

public class IsValid {
    public static void main(String[] args) {
        IsValid l =new IsValid();
        String key = "";
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("add：请输入");
            key =scanner.next();
            switch (key){
                case "add":
                    String str =scanner.next();
                    boolean x =l.isValid(str);
                    System.out.println(x);
                    break;
            }
        }

    }
    public boolean isValid(String s){
        int n = s.length();
        if (n%2==1){
            return false;
        }
        Map<Character,Character> paris = new HashMap<Character, Character>(){
            {
                put(')','(');
                put(']','[');
                put('}','{');
            }
        };
        Deque<Character> stack =new LinkedList<Character>();
        for (int i= 0;i<n;i++){
            char ch =s.charAt(i);
            if(paris.containsKey(ch)){
                if(stack.isEmpty()||stack.peek()!=paris.get(ch)){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

}
