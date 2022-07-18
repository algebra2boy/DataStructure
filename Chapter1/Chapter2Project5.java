public class Chapter2Project5 {
  public static final int length=5;
  public static void main (String[] args) {
    for(int i=0;i<=4;i++){
          for(int j=1;j<=-5*i+20;j++){
              System.out.print(" ");
          }
          System.out.print("  o  ******");
          for(int j=1;j<5*i;j++){
              System.out.print(" ");
          }
          System.out.println("*");
          for(int j=1;j<=-5*i+20;j++){
              System.out.print(" ");
          }
          System.out.print(" /|\\ *");
          for(int j=1;j<=5*(i+1);j++){
              System.out.print(" ");
          }
          System.out.println("*");
          for(int j=1;j<=-5*i+20;j++){
              System.out.print(" ");
          }
          System.out.print(" / \\ *");
          for(int j=1;j<=5*(i+1);j++){
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