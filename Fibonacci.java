import java.util.Scanner;
class Fibonacci{
 
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("TO PRINT Nth FIBONACCI NUMBER:-");
System.out.println("Enter a number:");
int n1=0;
int n2=1;
int n3 = sc.nextInt();
int count=n3;       
if(n3 == 0)
   System.out.println("Invalid Input");
if(n3 == 1)
   System.out.println('0');
for(int i=2;i<=count;++i)    
{    
   n3=n1+n2;      
   n1=n2;    
   n2=n3;    
}    
 System.out.print("The  "+count+"th Fibonacci number is "+n3);  
}
}

