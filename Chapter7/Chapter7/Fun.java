
public class Fun
{
    public static void main(){
        for(int i=1;i<=10;i++){
            a(i);
            System.out.println("\twriteSquence("+i+")");
        }
    }

    public static void a(int n){

        if(n>0){
            System.out.print((n+1)/2+" ");
        }
        if(n>1){
            a(n-2);
            System.out.print((n+1)/2+" ");
        }
    }
}
