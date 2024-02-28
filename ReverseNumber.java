import java.util.*;   

class ReverseNumber{
  
   public static void main(String args[]){
   
Scanner sc = new Scanner(System.in);   
System.out.println("TO REVERSE A GIVEN NUMBER:-");
System.out.println("Enter a number :"); 
      String normal = sc.nextLine();
      String reverse = "";   
      int size = normal.length();   
      for ( int r = size - 1; r >= 0; r-- )
         reverse = reverse + normal.charAt(r);    
System.out.println("Reverse of "+normal+" is "+reverse);
}  
}  
