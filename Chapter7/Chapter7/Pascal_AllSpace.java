import java.util.*;
public class Pascal_AllSpace
{
    public static final int size = 20;
    public static void main(){       
        triangle(size);
    }

    public static void triangle(int size){
        int row = size+1,column = 2*size+1;
        int[][] shape = new int[row][column];
        outer_triangle(shape,size);
        inter_triangle(shape,size);

        for(int i=0;i<shape.length;i++){
            for(int j=0;j<shape[i].length;j++){
                if(shape[i][j]!=0){//output the number if it is not 0
                    System.out.print(shape[i][j]+"\t");
                }else{// output space if it is 0 
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    /* this method is use for finding middle terms, middle terms only exists when size is 
    greater than 2*/
    public static void inter_triangle(int[][] a,int size){
        int row = 2,column = size,n=0;//the first middle term is always on the a[2][size]
        if(size>=2){
            for(int i=row;i<=size;i++){//start from row 2 and all the way down to the end
                for(int j=column;j<=size+n;j+=2){
                    /*the gap between these middle terms are 2
                    every row's first middle term, its column is always the 1 less than pervious one*/
                    a[i][j]=a[i-1][j-1]+a[i-1][j+1];
                }
                n++;
                column--;
            }
        }
    }
    // this method is use for finding the all the 1's on the side
    public static void outer_triangle(int[][] a,int n){
        int r = 0,c=0,value=1;
        for(int i=0;i<=n;i++){
            c = n-i;
            a[r][c] = value;
            r++;
        }
        r=0;
        c=0;
        for(int i=0;i<=n;i++){
            c = n+i;
            a[r][c] = value; 
            r++;
        }
    }
}
