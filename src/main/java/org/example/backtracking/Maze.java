package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        int[][] arr2 = new int[4][4];
        for(int[] arr1 : arr2)
            Arrays.fill(arr1, -1);

        //count all possible paths
        int count = countways(3,3);
        //int countDP = countwaysDP(3,3,arr2);
        System.out.println(count);

        //print all paths
        //path("",3,3);

        //return array of all possible paths
        System.out.println(returnArraysOfpath("",3,3));

        //print all paths if we can take diagonal, horizontal and vertical paths
//        includeDiagonalPath("",3,3);
        pathWithObstacle("",0,0,new int[]{2,2},new int[]{1,1});
    }

    public static void path(String p, int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
        }
        if(r>1){
            path(p+'R',r-1,c);
        }
        if(c>1){
            path(p+'D',r,c-1);
        }
    }

    public static void includeDiagonalPath(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
        }

        if(r>1){
            includeDiagonalPath(p+'V', r-1, c);
        }
        if(r>1 && c>1){
            includeDiagonalPath(p+'D', r-1, c-1);
        }
        if(c>1){
            includeDiagonalPath(p+'H', r, c-1);
        }
    }

    public static void pathWithObstacle(String p, int r, int c,int[] target, int[] block){
        if(r== target[0] && c==target[1]){
            System.out.println(p);
            return;
        }

        if(!(r==block[0] && c==block[1])){
            if(r<target[0]){
                pathWithObstacle(p+'D', r+1, c, target, block);
            }
            if(c<target[1]){
                pathWithObstacle(p+'R', r, c+1, target, block);
            }

        }
    }


    public static ArrayList<String> returnArraysOfpath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(returnArraysOfpath(p+'R',r-1,c));
        }
        if(c>1){
            list.addAll(returnArraysOfpath(p+'D',r,c-1));
        }
        return list;
    }

    public static int countways(int r,int c){
        if(r==1 || c==1){

            return 1;
        }

        int count = countways(r-1,c)+countways(r,c-1);
        return count;
    }

    //DP to store repetative results
    public static int countwaysDP(int r,int c, int[][] arr){
        if(r==1 || c==1){
            arr[r][c] = 1;
            return 1;
        }
        if(arr[r][c]!=-1){
            return arr[r][c];
        }

        arr[r][c] = countwaysDP(r-1,c,arr)+countwaysDP(r,c-1,arr);
        return arr[r][c];
    }

}
