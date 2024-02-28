import java.util.Scanner;
class CountOfDigits{   

public static void main(String[] args){  
Scanner sc = new Scanner(System.in);		
System.out.println("TO COUNT THE DIGITS OF A GIVEN NUMBER:-");
System.out.println("Enter a number:");
int N = sc.nextInt();
int count=0;
while(N>0){
   N=N/10;
   count++;
}
System.out.println("The count of digits is: "+count);  
}  
}
