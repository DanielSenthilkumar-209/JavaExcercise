import java.util.Scanner;
import java.io.*;
class ReduceToDigit{

static int ReduceBySubraction(int N){
while (N >= 10) {
   int X = N;
   int count = 0;
   while (N > 0) {
   N = N / 10;
   count++;
   }
   int array[] = new int[count];
   int i = count - 1; 
   while (X > 0) {
      array[i] = X % 10;
      X = X / 10;
       i--;
      }
      for (int j = 0; j < count - 1; j++) {
         N = N * 10 + Math.abs(array[j] - array[j + 1]);
      }
   }
   return N;
}

public static void main(String[] arg){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int result = ReduceBySubraction(N);
   System.out.println(result);
}
}
