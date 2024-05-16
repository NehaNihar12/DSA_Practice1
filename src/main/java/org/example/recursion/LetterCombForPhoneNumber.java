package org.example.recursion;

import java.util.ArrayList;

public class LetterCombForPhoneNumber {
    public static void main(String[] args) {
        phone("","19");
//        ArrayList<String> list = phoneArray("","12");
//        System.out.println(list);
//        System.out.println(phoneCount("","12"));
    }

    public static void phone(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }


        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3 && i<26;i++){
            char ch = (char) ('a'+i);
            phone(p+ch,up.substring(1));
        }
    }
    public static ArrayList<String> phoneArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        int index = Character.getNumericValue(ch);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (index-1)*3;i<index*3 && i<26;i++){
            ans.addAll(phoneArray(p+(char)('a'+i),up.substring(1)));
        }
        return ans;
    }

    // count no of combinations
    public static int phoneCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;
        for(int i = (digit-1)*3;i<digit*3 && i<26;i++){
            count += phoneCount(p+(char)('a'+i),up.substring(1));
        }
        return count;
    }
}
