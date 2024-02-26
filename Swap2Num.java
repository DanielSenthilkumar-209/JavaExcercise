import java.util.Scanner;

class Swap2Num{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("TO SWAP 2 NUMBERS:-");
System.out.println("Enter the first number:");
int a = sc.nextInt();
System.out.println("Enter the second number:");
int b = sc.nextInt();

System.out.println("Before Swapping: "+a+" "+b);

int temp = a;
a = b;
b = temp;

System.out.println("After Swapping: "+a+" "+b);
}
}

