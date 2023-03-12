import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {10,21,-3,30,40};
        System.out.println("the array numbers are: ");
        printArray(numbers);
        System.out.println();
        System.out.println("Do you want to sort the array?\nEnter Y/N");
        if(scan.next().equals("Y"))
        {
            System.out.println("Select 1 for sorting in Ascending Order" +
                    "\nSelect 2 for sorting in Descending Order");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1 -> sortArrayAscendingOrder(numbers);
                case 2 -> sortArrayDescendingOrder(numbers);
                default -> System.out.println("Invalid details entered");
            }
        }
        printArray(numbers);
    }
    public static void swapNumbers(int[] arrayList, int unsortedIndex, int numberToReplace) // unsortedIndex: smallestUnsortedIndex numberToReplace: indexwithSmallestNumber
    {
        if(unsortedIndex==numberToReplace)
            return;
        int temp = arrayList[unsortedIndex];
        arrayList[unsortedIndex]=arrayList[numberToReplace];
        arrayList[numberToReplace] =temp;
    }
    // print array
    public static void printArray(int[] numbers)
    {
        int i;
        for(i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }
    public static void sortArrayAscendingOrder(int[] numbers)
    {
        int smallestUnsortedIndex, smallestNumberIndex,i;
        for(smallestUnsortedIndex=0;smallestUnsortedIndex<numbers.length-1;smallestUnsortedIndex++)
        {
            smallestNumberIndex=smallestUnsortedIndex;
            for(i=smallestUnsortedIndex;i<numbers.length;i++)
            {
                if(numbers[smallestNumberIndex]>numbers[i])
                    smallestNumberIndex=i;
            }
            swapNumbers(numbers, smallestUnsortedIndex, smallestNumberIndex);
        }

    }
    // sort array
    public static void sortArrayDescendingOrder(int[] numbers)
    {
        int smallestUnsortedIndex, indexOfLargestElement, i;
        for(smallestUnsortedIndex=0;smallestUnsortedIndex<numbers.length-1;smallestUnsortedIndex++)
        {
            indexOfLargestElement=smallestUnsortedIndex;
            for(i=smallestUnsortedIndex+1;i<numbers.length;i++)
            {
                if(numbers[indexOfLargestElement]<numbers[i])
                    indexOfLargestElement=i;
            }
            swapNumbers(numbers,smallestUnsortedIndex,indexOfLargestElement);
        }

    }


}