import java.util.*;   

class Palindrome 
{  
   public static void main(String args[])  
   {   
      Scanner sc = new Scanner(System.in);   
      System.out.println("TO CHECK WHETHER A GIVEN NUMBER IS A PALINDROME OR NOT:-");
      System.out.println("Enter a number :"); 
      String normal = sc.nextLine();
      String reverse = "";   
      int size = normal.length();   
      for ( int r = size - 1; r >= 0; r-- )  
         reverse = reverse + normal.charAt(r);  
      if (normal.equals(reverse))  
         System.out.println(normal+" number is a palindrome.");  
      else  
         System.out.println(normal+" number is not a palindrome.");   
   }  
}  

