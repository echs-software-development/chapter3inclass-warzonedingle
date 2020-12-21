import java.util.Scanner;

public class Prob3  {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Number 0-4 plz");

  int grade  = scan.nextInt();

  if (grade == 4){
    System.out.println("A");
  }

  else if (grade == 3){
    System.out.print("B");
  }

  else if (grade == 2){
    System.out.print("C");
  }

  else if (grade == 1){
    System.out.print("D");
  }

  else {
    System.out.println("F");
  }
    
  }
}
