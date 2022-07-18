import java.util.*;
public class Maze
{
    public static void main()
    {
        System.out.println("A maze and how to find out the path");
        String[][] maze = new String[6][6];
        maze = makeTrap(maze);
        print(maze);
    }
    
    
    
    
    
    
    
    
    
    public static String[][] makeTrap(String[][] maze)
    {
        for(int i = 0;i<maze.length;i++)
        {
            for(int j = 0;j<maze.length;j++)
            {
                maze[i][j] = "O";
            }
        }
        for(int time = 1;time<=20;time ++){
            int row = (int)(Math.random()*(maze.length));
            int column = (int)(Math.random()*(maze[0].length));
            maze[row][column] = "X";
        }
        return maze;
    }
    private static void print(String[][] maze)
    {
        System.out.println();
        for (int i = 0; i < maze.length; i++) {
            System.out.print("|");
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + "|");
            }
            System.out.println();
        }
    }
}
