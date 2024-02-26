import java.util.*;

class DescendingOrder{

public static void main(String[] args){

Scanner  sc = new Scanner(System.in);
System.out.println("TO PRINT THE NUMBERS IN DESCENDING ORDER:-");
System.out.println("Enter the size of the array:");
int array_size = sc.nextInt();
int[] arr1 = new  int[array_size];

System.out.println("Enter the elements in the array:");
for(int i = 0; i < array_size; i++)
   arr1[i] = sc.nextInt();

System.out.println("The Elements of the array are:");
for(int i = 0; i < array_size; i++) 
   System.out.println(arr1[i] + " ");

int temp = 0;
for(int k = 0; k < array_size; k++){
   for(int j = k+1; j < array_size; j++){
      if(arr1[k] > arr1[j]){
         temp = arr1[k];
         arr1[k] = arr1[j];
         arr1[j] = temp;
      }
   }
}
System.out.println("Sorted Array:" +Arrays.toString(arr1));

}
}