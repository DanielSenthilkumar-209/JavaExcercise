import java.util.*;

class AscendingOrder{

public static void main(String[] args){

Scanner  sc = new Scanner(System.in);
System.out.println("TO PRINT THE NUMBERS IN ASCENDING ORDER:-");
System.out.println("Enter the size of the array:");
int array_size = sc.nextInt();
int[] arr1 = new  int[array_size];

System.out.println("Enter the elements in the array:");
for(int i = 0; i < array_size; i++)
   arr1[i] = sc.nextInt();

System.out.println("The Elements of the array are:");
for(int i = 0; i < array_size; i++) 
   System.out.println(arr1[i] + " ");
Arrays.sort(arr1);
System.out.println();

System.out.println("Sorted Ascending Array:" +Arrays.toString(arr1));
}
}

