import java.util.Scanner;

class Factorial{  
	
static int fact(int n)
{    
if (n == 0)    
return 1;    
else    
return(n * fact(n-1));    
}    
public static void main(String args[])
{  
Scanner sc = new Scanner(System.in);
System.out.println("TO PRINT FACTORIAL OF A GIVEN NUMBER:-");
System.out.println("Enter a number:");
int factorial=1;  
int number=sc.nextInt();
factorial = fact(number);   
System.out.println("Factorial of "+number+" is: "+factorial);    
}  
} 
