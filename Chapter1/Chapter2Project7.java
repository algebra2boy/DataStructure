public class Chapter2Project7{
    public static final int size=4;
    public static void main(String[]args){
    Needle();
    UpDome();
    Spacer();
    DownDome();
    Needle();
    Body();
    UpDome();
    Spacer();
    }
    public static void Needle(){
    for(int i=1;i<=size;i++){
        for(int j=1;j<=3*size;j++){
            System.out.print(" ");
    }
    System.out.println("||");
    }
    }
    public static void UpDome(){
      for(int i=1;i<=size;i++){
          for(int j=1;j<=-3*i+12;j++){
              System.out.print(" ");
              }
              System.out.print("__/");
                for(int j=1;j<=i-1;j++){
                    System.out.print(":::");
                }   
                    System.out.print("||");
                    for(int j=1;j<=i-1;j++){
                    System.out.print(":::");
                }
                    System.out.println("\\__");
                } 
            }

    public static void Spacer(){
        System.out.print("|");
        for(int i=1;i<=6*size;i++){
            System.out.print("\"");
        } 
        System.out.println("|");
        }
    public static void DownDome(){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            System.out.print("\\_");
            for(int j=1;j<=-2*i+13;j++){
            System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }
    public static void Body(){
        for(int i=1;i<=size*size;i++){
            for(int j=1;j<=9;j++){
                System.out.print(" ");
                }
                System.out.println("|%%||%%|");
            }
        }
}
    
