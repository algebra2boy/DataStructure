public class Pascal_Condensed_NoOnesAnd_repet{
    public static final int size = 7;
    public static void main(){       
        triangle(size);
    }

    public static void triangle(int size){
        int row = size+2,column = (size-1)/2+2,value=2;
        int[][] a = new int[row][column];
        // filled the first column
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j==0){
                    a[i][j]=value;
                    value++;
                }
            }
        }
        for(int i = 1;i<a.length;i++){
            for(int j=1;j<a[i].length;j++){
                a[i][j]=a[i-1][j]+a[i-1][j-1];
                /* there is a pattern:
                 * the last number of row 2,4.6,8,10....with column 1,2,3,4,5......
                 * [2][1] [4][2] [6][3] is always the twice the value of [1][0],[3][1],[5][2]
                 * therefore when row is divisible by 2 and row number is twice of column number*/
                if(i%2==0){
                    if(2*j==i){
                        a[i][j]=2*a[i-1][j-1];
                    }
                }
            }
        }
        //to eliminate the repetitions, if the number is greater than next one then filled with 0
        for(int i = 1;i<a.length;i++){
            for(int j=0;j<a[i].length-1;j++){
                if(a[i][j]>=a[i][j+1]){
                    //once we found that number is greater or equal the next number we can know all the way down will be 0
                    for(int k=j+1;k<a[i].length;k++){
                        a[i][k]=0;
                    }
                }
            }
        }
        //print out the whole thing
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]!=0){
                    System.out.print(a[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}
