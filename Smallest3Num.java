import java.util.Scanner;

class Smallest3Num{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("TO FIND SMALLEST AMONG THREE NUMBERS:");
System.out.println("Enter the first Number:");
int N1 = sc.nextInt();
System.out.println("Enter the second Number:");
int N2 = sc.nextInt();
System.out.println("Enter the third Number:");
int N3 = sc.nextInt();
if (N1 <= N2 && N1 <= N3)
   System.out.println(N1+" is the smallest number.");
else if(N2 <= N3 && N2 <= N1)
   System.out.println(N2+" is the smallest number.");
else
   System.out.println(N3+" is the smallest number.");
}
}

