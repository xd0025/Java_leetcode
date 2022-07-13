package com.Stringstr;

public class Easy003addBinary {
    public String addBinary(String a,String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        while (i>=0&&j>=0){
            int sum = carry;
            sum+=a.charAt(i--) - '0';
            sum+=b.charAt(j--) - '0';
            carry = sum/2;
            builder.append(sum%2);
        }
        while (i>=0){
            int sum =carry+a.charAt(i--)-'0';
            carry = sum/2;
            builder.append(sum%2);
        }
        while (j>=0){
            int sum =carry+b.charAt(j--)-'0';
            carry = sum/2;
            builder.append(sum%2);
        }
        if (carry>= 1){
            builder.append(carry);
        }
        return builder.reverse().toString();
    }
}
