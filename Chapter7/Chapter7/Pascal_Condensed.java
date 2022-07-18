public class Pascal_Condensed
{
    public static final int size = 10;
    public static void main(){       
        triangle(size);
    }

    public static void triangle(int size){
        int row = size+1,column = size+1;
        int[][] shape = new int[row][column];
        ones(shape);
        middleTerm(shape,size);

        for(int i=0;i<shape.length;i++){
            for(int j=0;j<shape[i].length;j++){
                if(shape[i][j]!=0){
                    System.out.print(shape[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }

    /* this method is use for finding middle terms, middle terms only exists when size is 
    greater than 2*/
    public static void middleTerm(int[][] a,int size){
        int row = 2;
        if(size>=2){
            for(int i=row;i<=size;i++){
                for(int j=1;j<=i-1;j++){
                    a[i][j]=a[i-1][j]+a[i-1][j-1];
                }
            }
        }
    }
    // this method is use for finding the all the 1's on the side
    public static void ones(int[][] a){
        int value=1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j==0||j==i){
                    a[i][j]=value;                  
                }
            }           
        }
    }
}
