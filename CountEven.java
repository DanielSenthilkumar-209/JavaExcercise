import java.util.Scanner;

class CountEven{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("TO PRINT AND COUNT THE EVEN DIGITS IN A GIVEN NUMBER:-");
System.out.println("Enter a number:");
String number = sc.nextLine();
char[] array1 = number.toCharArray();
int count = 0;
for(int i = 0; i < number.length();i++){
   if(array1[i]%2 == 0){
      System.out.println("The even numbers are: "+array1[i]);
      count++;
   }
}
System.out.println("Total count of even numbers: "+count);
}
}
