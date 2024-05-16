package org.example.backtracking;

//you can traverse in all 4 directions.
public class AllPathsInMaze {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true,true},
                            {true, true,true},
                            {true, true,true}};
        allPaths("",maze,0,0);
    }
    public static void allPaths(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
        }
        if(!maze[r][c]){
            return;
        }
//        This cell is in my current path.
        maze[r][c] = false;
        if(r<maze.length-1){
            allPaths(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPaths(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPaths(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPaths(p+'L',maze,r,c-1);
        }
//        This is where the function gets over. So remove the changes made by that function before its removed
        maze[r][c] = true;
    }
}
