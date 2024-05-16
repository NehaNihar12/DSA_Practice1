package org.example.recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceRet("",4));
    }

    public static ArrayList<String> diceRet(String p, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1;i<=6;i++){
            if(target-i>=0){
                ans.addAll(diceRet(p+i,target-i));
            }
        }
        return ans;
    }
    public static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for(int i=1;i<=6 && i<=target;i++){
                dice(p+i,target-i);
        }

    }
}
