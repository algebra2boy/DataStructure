public class nothing2 {
  public static final int length=5;
  public static void main (String[] args) {
    for(int i=1;i<=5;i++){
          for(int j=0;j<-5*i+25;j++){
              System.out.print(" ");
          }
          System.out.print("  o  ******");
          for(int j=0;j<5*i-5;j++){
              System.out.print(" ");
          }
          System.out.println("*");
          for(int j=0;j<-5*i+25;j++){
              System.out.print(" ");
          }
          System.out.print(" /|\\ *");
          for(int j=0;j<5*i;j++){
              System.out.print(" ");
          }
          System.out.println("*");
          for(int j=0;j<-5*i+25;j++){
              System.out.print(" ");
          }
          System.out.print(" / \\ *");
          for(int j=0;j<5*i;j++){
              System.out.print(" ");
          }
          System.out.println("*");
          }
          for (int lastLine=1; lastLine<=32; lastLine++) {
            System.out.print("*");
        }
        System.out.println();
    }
}