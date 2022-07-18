public class Why{
    public static void main(String[]args) {
        int x=1,y=2,z=3;
        z=nothing(x, z, y);
        System.out.println(x+" " +y+ " "+z);
    }
    public static int nothing(int z,int x,int y){
        z--;
        x=2*y+z;
        y=x-1;
        System.out.println(y+ " "+z);
        return x;
    }
    public static void a1(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=-i+6;j++){
                System.out.print("-");
        }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(2*i-1);
                
        }
        for(int j=1;j<=-i+6;j++){
                System.out.print("-");
        }
        System.out.println();
     }
}
}

        

