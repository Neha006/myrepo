/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static void doUnion(int arr1[], int arr2[], int m,
                        int n)
    {
        // hashset used to remove duplicates
        HashSet<Integer> unionSet = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            unionSet.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            unionSet.add(arr2[i]);
        }
        // Printing union of two sorted arrays
        for (int num : unionSet) {
            System.out.print(num + " ");
        }
    }
    static void doIntersection(int arr1[], int arr2[],
                               int m, int n)
    {
        int i, j;
        i = j = 0;
        // hashset used to remove duplicates
        HashSet<Integer> intersectionSet
            = new HashSet<Integer>();
        // using merging concept using i and j
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else {
                intersectionSet.add(arr1[i]);
                i++;
                j++;
            }
        }
        // Printing intersection of two sorted arrays
        for (int num : intersectionSet) {
            System.out.print(num + " ");
        }
    }
    // Driver code
    public static void main(String args[])
    {
        /* Function of finding union and Intersection of
        arr1[] and arr2[] m is the number of elements in
        arr1[] n is the number of elements in arr2[] */
        int arr1[] = { 1, 2, 2, 4, 5, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        System.out.print("Union of two sorted arrays : ");
        doUnion(arr1, arr2, m, n);
        System.out.println();
        System.out.print(
            "Intersection of two sorted arrays : ");
        doIntersection(arr1, arr2, m, n);
    }
}
// This code is contributed by Neha Pathak
Another Approach using HashSet for handling duplicates elements in sorted arrays : The idea of this approach is to build a Hash set to store the unique elements of first array and second array to the hash set and find the union and intersection by using merging approach to avoid duplicates.
