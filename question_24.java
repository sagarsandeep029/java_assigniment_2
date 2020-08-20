//Find out the Kth smallest element in an unsorted array

import java.util.Arrays; 
  
class question_24 { 
    
    public static int kthSmallest(Integer[] arr, int k) 
    { 
        Arrays.sort(arr); 
        return arr[k - 1]; 
    } 
    public static void main(String[] args) { 
        Integer arr[] = new Integer[] { 23, 3, 15, 17, 109 }; 
        int k = 2; 
        System.out.print("K'th smallest element is " + kthSmallest(arr, k)); 
    } 
} 