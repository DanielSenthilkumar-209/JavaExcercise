import java.util.Scanner;
class PrimeNumber{ 

public static void main(String[] args){
Scanner sc = new Scanner(System.in);	
System.out.println("TO CHECK WHETHER THE GIVEN NUMBER IS A PRIME OR NOT:-");
System.out.println("Enter a number:");
int N = sc.nextInt();
int count=0;
for(int p = 1; p<=N;p++){
   if(N%p==0)
      count++;
}

if(N == 1)
   System.out.println(N+" is neither a prime nor a composite number.");
else if(count > 2)
   System.out.println(N+" is not a prime number.");
else
   System.out.println(N+" is a prime number.");
}	
}