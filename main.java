package mult;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
 int N,R;
 System.out.println("enter a number: ");
    N = input.nextInt();

  for(int i=1; i<=10; i++){
   
     R = N*i;
     System.out.println("the Multiplication of "+N+" X "+i+": "+R);



  }

    }
}
