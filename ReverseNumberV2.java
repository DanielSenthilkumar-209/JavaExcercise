import java.util.Scanner;

class ReverseNumberV2{  

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("TO REVERSE A GIVEN NUMBER:");
System.out.println("Enter a number:");  
int N = sc.nextInt(); 
int rev = 0;  
while(N != 0){  
   int rem = N % 10;  
   rev = rev * 10 + rem;  
   N = N/10;  
}  
System.out.println("The reverse of the given number is: " +rev);  
}  
}