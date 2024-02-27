import java.util.Scanner;

class MultiplicationTable{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("MULTIPLICATTION TABLE:");
System.out.println("Enter a number:");
int num = sc.nextInt();
int range = 1;
System.out.println("Multiplication Table of "+num+" is as follows:-");
while(range  <= 20){
System.out.println(num+" * "+range+" = "+num*range);
range++;
}
}
}






















































