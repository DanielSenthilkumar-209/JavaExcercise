import java.util.Scanner;  

class ArmstsrongNumber{
  
static boolean isArmstrong(int N)   
{   
int temp;
int D = 0;
int limit = 0; 
int sum=0;   
temp = N;   
while(temp>0)    
{   
temp = temp/10;   
D++;   
}   
temp = N;   
while(temp>0)   
{        
limit = temp % 10;   
sum +=  (Math.pow(limit, D));      
temp = temp/10;   
}    
if(N==sum)   
   return true;      
else 
   return false;   
}   
public static void main(String args[])     
{        
Scanner sc= new Scanner(System.in);  
System.out.println("TO PRINT THE ARMSTRONG NUMBERS UPTO A RANGE:");
System.out.println("Enter the limit: ");    
int number = sc.nextInt();    
System.out.print(number+" is an Armstrong Number.");   
System.out.println("Armstrong Numbers up to "+ number + " are: ");  
for(int a = 0; a <= number; a++)  
   if(isArmstrong(a))
System.out.print(a+", "); 
}
}
