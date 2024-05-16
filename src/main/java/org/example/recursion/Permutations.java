package org.example.recursion;

public class Permutations {
    public static void main(String[] args){
//        System.out.println(permutationsCount("","abcd"));
        System.out.println(permutationsCount1("","abc",0));
    }
    public static int permutationsCount(String p, String up){

        if(up.isEmpty()){

            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count+= permutationsCount(first+ch+second,up.substring(1));
        }
        return count;
    }

    public static int permutationsCount1(String p, String up,int count){

        if(up.isEmpty()){
            count = count+1;
            return count;
        }

        char ch = up.charAt(0);
//        int count = 0;
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
                String second = p.substring(i,p.length());
            count = permutationsCount1(first+ch+second,up.substring(1),count);
        }
        return count;
    }

}
