import java.util.Scanner;

class LastDigit{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("TO PRINT THE LAST DIGIT OF A GIVEN NUMBER:-");
System.out.println("Enter a Number:");
int N = sc.nextInt();
int Unit = N%10;
System.out.println("Last digit of the number is: "+Unit);
}
}