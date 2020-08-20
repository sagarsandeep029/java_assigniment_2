//Replace each element of the array by its rank in the array

import java.util.*; 
  
class question_22 { 
  
    static void changeArr(int[] input) 
    { 
        int newArray[]  = Arrays.copyOfRange(input, 0,input.length);
                               
        Arrays.sort(newArray); 
        Map<Integer, Integer> ranks  = new HashMap<>(); 
        int rank = 1; 
        for (int index = 0; index < newArray.length; index++) { 
  
            int element = newArray[index]; 
            if (ranks.get(element) == null) { 
                ranks.put(element, rank); 
                rank++; 
            } 
        } 
        for (int index = 0; index < input.length; index++) { 
  
            input[index] = ranks.get(input[index]);    
        } 
    } 
    
    public static void main(String[] args) 
    { 
        
        int[] arr = { 100,2,33,12,1,9,234,1,2 };          
        changeArr(arr);         
        System .out .println(Arrays.toString(arr)); 
    } 
} 