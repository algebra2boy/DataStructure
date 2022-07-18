import java.util.*;
public class Books
{
    public static void main(){
        int[] a1 = {2,4,6,8,10,12,14,16};
        int[] a2 = {1,1,2,3,5,8,13,21};
        mystery(a1,a2);
    }

    public static void mystery(int a[], int b[]){
        for(int i=0;i<a.length;i++){
            a[i] = a[2*i%a.length]-b[3*i%b.length];          
        }
        System.out.println(Arrays.toString(a));
    }
}
