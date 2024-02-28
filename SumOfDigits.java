import java.util.Scanner;  

class SumOfDigits{  

public static void main(String args[]){
Scanner sc = new Scanner(System.in);  
System.out.println("TO SUM THE DIGITS OF A GIVEN NUMBER:-");
System.out.println("Enter the number: ");
int N = sc.nextInt();
int D; 
int sum = 0;        
while(N > 0){  
   D = N % 10;  
   sum = sum + D;  
   N = N / 10;  
}  
System.out.println("Sum of the digits of a given number is : "+sum);  
}  
}  