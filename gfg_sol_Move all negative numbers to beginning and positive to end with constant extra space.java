// Java program of the above
// approach
import java.io.*;
import java.util.*; 
 
class GFG{
 
// Function to shift all the
// negative elements on left side
static void segregateElements(int[] arr,
                     int n)
{
    // create two list one stores positive values
    // and second stores negative values
    ArrayList<Integer> positives = new ArrayList<>();
    ArrayList<Integer> negatives = new ArrayList<>();
  
    // iterate each element of given array
    // if the element is positive then insert in positives ArrayList
    // if the element is positive then insert in negatives ArrayList
    for(int i:arr)
        {
            if(i<0)
                negatives.add(i);
            else
                positives.add(i);
        }
    // iterate all the elements from both the list and insert in given array 
    // first insert all negatives 
    // then insert all positives
    int j=0;
    for(int i=0;i<negatives.size();i++)
        arr[j++]=negatives.get(i);
    for(int i=0;i<positives.size();i++)
        arr[j++]=positives.get(i);
}
 
// Function to print the array
static void display(int[] arr, int n)
{
     
    // Loop to iterate over the element
    // of the given array
    for(int i = 0; i <= n; ++i)
        System.out.print(arr[i] + " ");
         
    System.out.println();
}
 
// Drive code
public static void main(String[] args)
{
    int[] arr = { -12, 11, -13, -5,
                   6, -7, 5, -3, 11 };
                    
    int arr_size = arr.length;
 
    // Function Call
    segregateElements(arr, arr_size );
    display(arr, arr_size -1);
}
}

 
// This code is contributed by imnehapathak0504@gmail.com
// Time complexity: O(N) 
// Auxiliary Space: O(1)
// code is 
// This is applicable for when order of elements matters
// https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
