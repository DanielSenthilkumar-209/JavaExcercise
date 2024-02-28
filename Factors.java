import java.util.Scanner;

class Factors{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("TO GET THE FACTORS OF A GIVEN NUMBER:-");
System.out.println("Enter a Number:");
int N = sc.nextInt();
System.out.println("The factors of "+N+" are: ");
for(int f = 1; f <= N; f++){
   if(N % f == 0)
      System.out.println(f+ " ");
}
}
}

