package SortingTypes;

/**
 * Created by Kalkidan on 12/8/2015.
 */
public class Main {
   public static void main(String[] args){
      //objects for bubbleSort
      BubbleSort objBubble=new BubbleSort();
      UnsortedValues objUnsortedValues=new UnsortedValues();

      //print unsorted values
      System.out.println("Unsorted:");
      for(int i=0;i<objUnsortedValues.x.length;i++){
         System.out.printf("%02d,",objUnsortedValues.x[i]);
      }
      System.out.println();
      System.out.println("Sorted:");
      objBubble.bubbleSort();
      objBubble.printArray();
   }
}
