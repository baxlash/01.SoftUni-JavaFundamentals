import javafx.collections.transformation.SortedList;
import jdk.internal.util.xml.impl.Input;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Baxlash on 26.3.2016 г..
 */
public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOfElements = Integer.parseInt(console.nextLine());
        System.out.print(String.format("Enter %d numbers separated by space: ", numberOfElements));
        String[] inputNumbers = console.nextLine().split(" ");
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        numbers = sort(numbers);

        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }

    public static int[] sort( int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                if ( num[ j ] > num[j+1] )   // change to > for ascending sort
                {
                    temp = num[ j ];                //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
        return num;
    }

}
