package SortingTypes;

/**
 * Created by Kalkidan on 12/8/2015.
 */
/*Notes of Bubble Sort
  =>Simplest of all sorting routines
  =>we compare the two elements of an array
  and continue to swap them if they are out of
  order.
  =>continue doing this until the largest value
  bubbles up to the end of the array.
  =>we continue doing this for each elements until
  each element is fully sorted.
  ==>PSEUDO-CODE for Bubble sort<==
     for i=(n-1) to 1
         for j=0 to (i-1)
            if A[j]>A[j+1]
               swap(A[j],A[j+1])
  ==>Characteristics of BubbleSort
      *BubbleSort is a slow algorithm
         =>Time complexcity comparisons
            *during the first path we perform n-1 comparisons
            *(n-1)+(n-2)+(n-3)+.....+1
            * Arthmatic series= n(n-1)/2= n^2-n/2
            * for large values the n^2 dominates so we say the
               algorithm is big 0(n^2)
*/
public class BubbleSort {
   //Objects created
   UnsortedValues objValues=new UnsortedValues();

   //Sorting values
   public void bubbleSort(){
      for(int i=objValues.x.length-1;i>1;i--){
         for(int j=0;j<i;j++){
            if(objValues.x[j]>objValues.x[j+1]){
               swapValues(j,j+1);
            }
         }
      }
   }

   //swap values method
   public void swapValues(int indexone, int indextwo){
      int temp=objValues.x[indexone];
      objValues.x[indexone]=objValues.x[indextwo];
      objValues.x[indextwo]=temp;
   }
   //print array method
   public void printArray(){
      for(int i=0;i<objValues.x.length; i++) {
         System.out.printf("%02d,",objValues.x[i]);
      }
   }




}
