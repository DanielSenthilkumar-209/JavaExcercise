import java.util.Scanner;

class CountOdd{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("TO PRINT AND COUNT THE ODD DIGITS IN A GIVEN NUMBER:-");
System.out.println("Enter a number:");
String number = sc.nextLine();
char[] array1 = number.toCharArray();
int count = 0;
for(int i = 0; i < number.length();i++){
   if(array1[i]%2 == 1){
      System.out.println("The odd numbers are: "+array1[i]);
      count++;
   }
}
System.out.println("Total count of odd numbers: "+count);
}
}
