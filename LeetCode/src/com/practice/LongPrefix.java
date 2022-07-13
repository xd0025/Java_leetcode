package com.practice;

public class LongPrefix {
    public static void main(String[] args) {
        LongPrefix l =new LongPrefix();
        String[] str ={"flower","flllm","flpka"};
        String x=l.longPrefix(str);
        System.out.println(x);

    }
    public String longPrefix(String[] str){
        if (str==null||str.length==0){
            return "";
        }
        String pre =str[0];
        int count =str.length;
        for (int i=1;i<count;i++){
            pre=longPrefix(pre,str[i]);
            if (pre.length()==0){
                break;
            }
        }
        return pre;
    }
    public String longPrefix(String str1,String str2){
        int length = Math.min(str1.length(),str2.length());
        int index =0;
        for (int i=0;i<length;i++){
            if (str1.charAt(index)==str2.charAt(index)){
                index++;
            }
        }
        return str1.substring(0,index);
    }
}
