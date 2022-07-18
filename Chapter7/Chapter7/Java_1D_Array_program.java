import java.util.*;
public class Java_1D_Array_program
{
    public static void main()
    {
        int[] problem1 = {5,100,-12,1};
        problem1(problem1);

        int[] problem2 ={3,5,3,7,3,3,1,2,5,2,9,3,0,8,6};
        problem2(problem2,3);

        String[] problem3 ={"ho","Why","Google"};
        problem3(problem3);

        int[] problem4 = {2, 6, -8, 5, -4, -3, 1, -8, 4, -1, 7, 10};  
        problem4(problem4);

        double[] problem5 = {2.3,6.73,4.01,3.999,7.5};
        problem5(problem5);
        
        int[] problem6 = {10,20,30,40,50};
        problem6(problem6);

        int problem7[] = {1,2,3,4,102,6,7,100,9,10};
        problem7(problem7);

        int modes[ ] = {1, 1, 1, 2 , 2, 2, 3, 3, 3};//problem8
        System.out.println("modes:"+modes(modes));
        
        problem9(149);
        
        char[] problem10 = new char[6];
        smoke(problem10);
    }
    public static String modes(int a[]){
        String mode = "";
        int prev = a[0];
        int occur =1;
        int maxOccur = 1;
        for(int i=1;i<a.length;i++){
            if(a[i]==prev){
                occur++;
            }else{
                if(occur>maxOccur){
                    maxOccur = occur;
                    mode = ""+prev;
                }else if(occur==maxOccur){
                    mode = mode+","+prev;
                }
                occur =1;
                prev = a[i];
            }
        }
        if(occur>maxOccur){
            mode = ""+prev;
        }else if(occur==maxOccur){
            mode = mode+","+prev;
        }
        return mode;
    }
    public static void problem6(int[] a){
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length/2;i++){
            int j = a.length-i-1;
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println(Arrays.toString(a)+"\n");
    }
    public static void smoke(char[] a){
        int number_of_smoke = 2,number_of_nonsmoke =4;
        int smoke_pos = 0,nonsmoke_pos = 2;
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
                a[smoke_pos] = 's';
                smoke_pos++;
                number_of_smoke--;
            }else if(input=='n'&&number_of_nonsmoke>0){
                a[nonsmoke_pos] = 'n';
                nonsmoke_pos++;
                number_of_nonsmoke--;
            }
            System.out.println(Arrays.toString(a)+"\n");
        }
    }
    public static void problem9(int N){
        int a[] = new int[8];
        for(int i=a.length-1;i>=0;i--){
            if(N%2==0){
                a[i]=0;
            }else{
                a[i]=1;
            }
            N=N/2;
        }
        System.out.println(Arrays.toString(a)+"\n");
    }

    public static void problem7(int[] a){
        int largest1 = a[0],largest2 = a[0],largest3 = a[0],sum;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest1){
                largest3 = largest2;
                largest2 = largest1;                
                largest1 = a[i];                
            }else if(a[i]>largest2){
                largest3 = largest2;
                largest2 = a[i];
            }else{ //a[i]>largest3
                largest3 = a[i];
            }
        }
        sum = largest2+largest3;
        String result,sign;
        if(largest1>sum){result = "yes";sign = ">";}
        else{result = "no";sign = "<";}
        System.out.println(Arrays.toString(a));
        System.out.println("largest1="+largest1+"\nlargest2="+largest2+"\nlargest3="+largest3+"\n"+result+" "+largest1+sign+sum+"\n");
    }

    public static void problem5(double a[]){
        double sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        double average = sum/a.length;
        System.out.println("sum="+sum+"\naverage="+average+"\n");
    }

    public static void problem4(int a[])
    {
        int positive = 0, negative = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                positive++;
            }else{
                negative++;
            }
        }
        System.out.println("positive count="+positive+"\nnegative count="+negative+"\n");
    }

    public static void problem3(String words[])
    {
        String first = words[0];
        int longest = first.length(), smallest = first.length();
        int long_pos = 0,small_pos = 0;
        for(int i=0;i<words.length;i++){
            String element = words[i];
            if(element.length()>longest){
                longest = element.length();
                long_pos = i;
            }else if(element.length()<smallest){
                smallest = element.length();
                small_pos = i;
            }
        }
        System.out.println("longest is "+words[long_pos]+" position is "+long_pos+"\nshortest is "+words[small_pos]+" position "+small_pos+"\n");
    }

    public static void problem2(int a[],int k)
    {
        int great = 0,less = 0,equal = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>k){
                great++;
            }else if(a[i]<k){
                less++;
            }else{
                equal++;
            }
        }
        System.out.println("k count ="+equal+"\nless than k count = "+less+"\ngreater than k count = "+great+"\n");
    }

    public static void problem1(int a[])
    {
        int largest = a[0],smallest = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest){
                largest=a[i];
            }else{
                smallest=a[i];
            }
        }
        System.out.println("largest = "+largest+"\nsmallest = "+smallest+"\n");
    }
}
