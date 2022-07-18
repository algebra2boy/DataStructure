public class Extra_Challenging
{
    public static void main(){
        cubes(9);
        //prime_numbers(10);
        friendly(220,284);
    }

    public static void cubes(int k){
        int n1=1,n2=0,value=2;
        for(int i=1;i<=k;i++){//n1 is the first number
            n1=n1+n2;
            n2=n2+value;
        }
        int number=n1,sum=0;String a="";
        for(int i=1;i<=k-1;i++){
            number=number+value;
            sum=sum+number;
            a=a+"+"+number;
        }
        sum=sum+n1;
        System.out.println(k+"^3="+sum+"="+n1+a);   
    }

    /*public static void prime_numbers(int number){
    if(number%2!=0){
    throw new IllegalArgumentException("This is not a even number");
    }
    int first_count_Factor=0;
    int first_Prime_Number=0;
    int second_Number=0;
    for(int i=1;i<=number;i++){
    for(int j=1;j<=i;j++){
    if(i%j==0){
    first_count_Factor++;
    }
    }
    if(first_count_Factor==2){
    first_Prime_Number=i;
    }
    second_Number=number-first_Prime_Number;
    int second_count_Factor=0;
    for(int j=1;j<=second_Number;j++){
    if(second_Number%j==0){
    second_count_Factor++;
    }
    }
    if(second_count_Factor==2){
    second_Number=second_Number;
    }
    }
    System.out.println(number+"="+first_Prime_Number+"+"+second_Number);
    }*/
    public static void friendly(int M,int N)
    {
        int M_Sum=0,N_Sum=0;
        boolean test1,test2;
        String result="";
        System.out.println("M:"+M+" N:"+N);
        for(int i=1;i<M;i++)
        {
            if(M%i==0){
                M_Sum=M_Sum+i;
            }
        }
        for(int i=1;i<N;i++){
            if(N%i==0)
            {
                N_Sum=N_Sum+i;
            }
        }
        if(M_Sum==N)
        {
            test1=true;
        }else{
            test1=false;
        }
        if(N_Sum==M)
        {
            test2=true;
        }else{
            test2=false;
        }
        if((test1&&test2)==true){
            result="Very friendly";
        }else{
            result="Not friendly at all";
        }
        System.out.println(result);
    }

    public static void friendly_given(int M,int N)
    {
        int M_Sum=0,N_Sum=0;
        boolean test1,test2;
        String result="";
        System.out.println("M:"+M+" N:"+N);
        for(int i=1;i<M;i++)
        {
            if(M%i==0){
                M_Sum=M_Sum+i;
            }
        }
        for(int i=1;i<N;i++){
            if(N%i==0)
            {
                N_Sum=N_Sum+i;
            }
        }
        if(M_Sum==N)
        {
            test1=true;
        }else{
            test1=false;
        }
        if(N_Sum==M)
        {
            test2=true;
        }else{
            test2=false;
        }
        if((test1&&test2)==true){
            result="Very friendly";
        }else{
            result="Not friendly at all";
        }
        System.out.println(result);
    }
}
