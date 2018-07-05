package WebM;

//package basicjava;

import java.util.Scanner;

public class First_Exam {
 public static void main(String args[]) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter no of elment");
  int n = input.nextInt();
  int array[] = new int[n];
  System.out.println(array.length);
  
  System.out.println("Enter number ");
  for (int i = 0; i <array.length; i++) {
   array[i] = input.nextInt();
  }
int temp;
  for (int x = 0; x < array.length-1; x++) {
   //System.out.println(array[x] + "ww");

   for (int y = x + 1; y < array.length; y++) {
    if (array[x] > array[y]) {
     temp = array[x];
     array[y] = array[x];
     //array[y] = temp;
temp=array[y];
    }
    
   }
   
  }
  System.out.println(array[n - 2]);
  System.out.println("Sorted");
   
  
  
 }

}