import java.util.*;
public class Java_2DArray_program {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[][] problem1 = { {10, 30, 50, 200},
                {60, 40, 70, 55},
                {80, 5, 35, 100} };
        System.out.println("problem1");
        problem1(problem1);

        int[][] problem2 = { {10, 30, 50, 200},
                {60, 40, 70, 55},
                {80, 5, 35, 100} };

        System.out.println("problem2");
        problem2(problem2);

        int[][] problem3 = { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12} };  
        System.out.println("problem3");
        problem3(problem3);

        int[][] problem4 = { {10, 30, 50, 200}, 
                {60, 40, 70, 55},
                {80, 5, 35, 100} };
        System.out.println("problem4");
        problem4(problem4);

        int[][] problem5  = { {1, 2, 3, 4},
                {5, 6, 7, 8}, 
                {9, 10, 11, 12} };
        System.out.println("problem5");
        problem5(problem5);

        int[][] problem6  = {{1,2,3,4},      
                {5,6,7,8},             
                {9,10,11,12},
                {13,14,15,16} };
        System.out.println("problem6");
        problem6(problem6);

        String[][] problem7 ={
                {"dog","kitty","moose","ant","elephant"},
                {"frog","bird","bat","porcupine","mice"},
                {"lion","zebra","snake","toad","turtle"}};
        System.out.println("problem7");
        problem7(problem7);

        int problem8[][] = {  {10,10,10,10,10},
                {10,50,50,50,10},
                {10,50,100,50,10},                                                                                       
                {10,50,50,50,10},
                {10,10,10,10,10}};
        System.out.println("problem8");
        problem8(problem8);

        int p9[][] = {  {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25} };
        System.out.println("problem9");
        System.out.println(Arrays.deepToString(transpose(p9)));

        char[][] problem10 = new char[2][6];
        smoke(problem10);
    }

    public static void smoke(char[][] a){
        int number_of_smoke = 6,number_of_nonsmoke =5;
        int smoke_pos = 0,nonsmoke_pos = 2;
        int row_smoke = 0,row_nonsmoke=0;
        while((number_of_smoke>0)||(number_of_nonsmoke>0)){
            Scanner console = new Scanner(System.in);
            System.out.print("Tell me are you a smoker or nonsmoker(s/n)");
            char input = console.next().charAt(0);

            if(number_of_smoke==0&&input=='s'){
                System.out.println("Sorry,no more seat for smoker");
            }
            if(number_of_nonsmoke==0&&input=='n'){
                System.out.println("Sorry,no more seat for nonsmoker");
            }

            if(input=='s'&&number_of_smoke>0){
                if(smoke_pos==2){
                    row_smoke++;
                    smoke_pos=0;
                    number_of_smoke =2;
                }
                a[row_smoke][smoke_pos] = 's';
                smoke_pos++;
                number_of_smoke--;

            }else if(input=='n'&&number_of_nonsmoke>0){
                if(nonsmoke_pos==a[0].length){
                    row_nonsmoke++;
                    nonsmoke_pos=2;
                    number_of_nonsmoke =4;
                }
                a[row_nonsmoke][nonsmoke_pos] = 'n';
                nonsmoke_pos++;
                number_of_nonsmoke--;
            }
            System.out.println(Arrays.deepToString(a)+"\n");
        }
    }

    public static int[][] transpose(int[][] a){
        int temp;int j;
        for(int i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                if(i!=j){
                    temp = a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
            j++;
        }
        return a;
    }

    public static void problem8(int a[][]){
        int row,col,sum=0;
        for(int i=1;i<=3;i++){
            row = (int)(Math.random()*a.length);
            col = (int)(Math.random()*a[0].length);
            sum+=a[row][col];
            System.out.println("Hit row:"+row+"\tcol:"+col+" Point:"+a[row][col]);
        }
        System.out.println("sum="+sum);
    }

    public static void problem7(String a[][]){
        int max = count(a[0][0]),row = 0,column=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                String word = a[i][j];
                int count =0;
                for(int k=0;k<word.length();k++){
                    count = count(word);
                }
                if(count>max){
                    max = count;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(a[row][column]+"\trow="+row+"\tcolumn="+column+"\tvowel count="+max);
    }

    public static int count(String a){
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static void problem6(int a[][]){
        int sum = 0,front=0,back=a[0].length-1;
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j||(i==front&&j==back)){
                    sum+=a[i][j];
                }
                if((a.length==a[0].length)&&front==back){
                    sum-=a[front][back];
                }
            }
            front++;
            back--;
        }
        System.out.println("sum of diagonals:"+sum+"\n");
    }

    public static void problem5(int a[][]){
        int sum = 0;
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j==0||j==a[i].length-1||i==0||i==a.length-1){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("sum of the edges are:"+sum+"\n");

    }

    public static void problem4(int a[][]){
        double maxRow_Avg= 0,maxCol_Avg=0; int max_row = 0,max_col = 0;
        for(int i=0;i<a.length;i++){
            double row_sum=0,row_avg=0;
            for(int j=0;j<a[i].length;j++){
                row_sum+=a[i][j];
            }
            row_avg = row_sum/a[i].length;
            System.out.println("Average of row "+i+"="+row_avg);
            if(row_avg>maxRow_Avg){
                maxRow_Avg = row_avg;
                max_row = i;
            }  
        }

        for(int i=0;i<a[0].length;i++){
            double col_sum=0,col_avg=0;
            for(int j=0;j<a.length;j++){
                col_sum+=a[j][i];              
            }
            col_avg = col_sum/a.length;  
            System.out.println("Average of column "+i+"="+col_avg);
            if(col_avg>maxCol_Avg){
                maxCol_Avg = col_avg;
                max_col = i;
            }  
        }
        System.out.println("MaxAvg row="+max_row+" MaxAvg="+maxRow_Avg);
        System.out.println("MaxAvg col="+max_col+" MaxAvg="+maxCol_Avg+"\n");
    }

    public static void problem3(int a[][]){
        int oddCount =0,evenCount=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        System.out.println("evenCount:"+evenCount+" oddCount:"+oddCount+"\n");
    }

    public static void problem2(int a[][]){
        int largest = a[0][0],smallest=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>largest){
                    largest = a[i][j];
                }
                if(a[i][j]<smallest){
                    smallest = a[i][j];
                }

            }
        }
        System.out.println("largest:"+largest+" smallest: "+smallest+"\n");
    }

    public static void problem1(int a[][]){
        int sum = 0,count =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
                count++;
            }
        }
        System.out.println("Sum="+sum+" Average= "+ (double)sum/(count)+"\n");
    }
}