import java.util.Scanner;

class ASCIIValue{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("TO PRINT THE ASCII VALUES FOR THE GIVEN CHARACTERS:-");
System.out.println("Enter 1st character:");
char c1 = sc.next().charAt(0);
System.out.println("Enter 2nd character:");
char c2 = sc.next().charAt(0);
int n1 = c1;
int n2 = c2;
System.out.println("The ASCII value of "+c1+" is: "+n1);
System.out.println("The ASCII value of "+c2+" is: "+n2);
}
}
