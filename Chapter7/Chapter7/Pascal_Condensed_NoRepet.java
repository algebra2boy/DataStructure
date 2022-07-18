public class Pascal_Condensed_NoRepet{
    public static final int size = 10;
    public static void main(){       
        triangle(size);
    }

    public static void triangle(int size){
        int row = size+1,column = (size-2)/2+2;
        int[][] a = new int[row][column];
        // filled all the ones
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j==0){
                    a[i][j]=1;
                }
            }
        }
        //to find the value for the middle terms
        for(int i = 1;i<a.length;i++){
            for(int j=1;j<a[i].length;j++){
                a[i][j]=a[i-1][j]+a[i-1][j-1];
            }
        }
        //to eliminate the repetitions, if the number is greater than next one then filled with 0
        for(int i = 1;i<a.length;i++){
            for(int j=1;j<a[i].length-1;j++){
                if(a[i][j]>=a[i][j+1]){
                    /*once we found that number is greater or equal next number
                    we can know all the way down will be 0
                     */
                    for(int k=j+1;k<a[i].length;k++){
                        a[i][k]=0;
                    }
                }
            }
        }
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