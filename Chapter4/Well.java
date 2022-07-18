import java.util.*;
public class Well{  
    public static int Exercise_20(int a,int b,int c){
        int number=0;
       if((a!=b)&&(a!=c)&&(b!=c)){
           number=3;
       }else if((a==b)&&(a==c)&&(b==c)){
           number=1;
       }else{
           number=2;
       }
       return number; 
    }
    public static void xo(int size) {
    int front = 0;
    int back = size - 1;
    
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            if(j == front || j == back)
                System.out.print("x");
            else
                System.out.print("o");
        }
        System.out.println();
        front++;
        back--;
    }
}
}
    