/*public class Project1
{
    public static void main()
    {
        well(3,4);
    }
    public static void well(int a,int b){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
            }
        }
    }*/
    //===================Programming Projects===================

public class ProgrammingProjects{
public static final int segment=10;
public static final int height=5;
public static void main (){
System.out.println("Programming Project #1");
printTree();
}
public static void printTree(){
int Stars= 2*height+2*segment-3;
String maxStr="";
for(int i=1; i<=segment; i++){
for(int line=1; line<=height; line++){
String StarsStr="";
for(int j=1; j<= 2*line+2*i-3; j++){
StarsStr+="*";
}
for(int space=0; space<= Stars-(height+line+i); space++){
StarsStr= " "+StarsStr;
} 
System.out.println(StarsStr);
}
}
for(int i=0; i<=Stars/2; i++){
System.out.print(" ");
}
System.out.print("*\n");
for(int i=0; i<=Stars/2; i++){
System.out.print(" ");
}
System.out.print("*\n");
for(int i=0; i<=Stars/2-3;i++){
System.out.print(" ");
}
System.out.print("*******\n");
}
}
    
