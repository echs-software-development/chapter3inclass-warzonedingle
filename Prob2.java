import java.util.Scanner;

public class Prob2  {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 4 decimals: ");

    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    double num3 = scan.nextDouble();
    double num4 = scan.nextDouble();
    
    double num5 = (num1 + num2 + num3 + num4)/4;
    
    if (num5 >= 89.5)

    System.out.println("Above average");


    
  }
}
