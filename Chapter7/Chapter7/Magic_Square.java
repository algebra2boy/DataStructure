import java.util.*;
public class Magic_Square {
    public static void main(String[] args) {
        magic_square(7);
    }

    public static void magic_square(int size){
        int[][] square = new int[size][size];
        boolean[][] filled = new boolean[size][size];//defaults to false
        int value=1,r = 0,c = square[0].length/2;
        square[0][square[0].length/2]=value;
        filled[0][square[0].length/2]=true;
        for(int i=1;i<size*size;i++){
            if(r==0&&c==size-1){
                r++;
            }else{
                r--;
                c++;
                if(r<0){
                    r = square.length-1;
                }else if(c>square[0].length-1){
                    c = 0;
                }else if(filled[r][c]==true){
                    r=r+2;
                    c--;
                }
            }
            value++;
            square[r][c]=value;
            filled[r][c]=true;
        }
        for(int i=0;i<square.length;i++){
            for(int j=0;j<square[i].length;j++){
                System.out.print(square[i][j]+"\t");
            }
            System.out.println();
        }
    }
}