class Solution {
    public int countElements(int[] arr) {
        // pattern 1
//         int count = 0;
//         for(int i = 0; i<arr.length-1;i++)
//         {
//              arr[i] = arr[i]+1;
//              for(int j = 1; j<arr.length;j++)
//                 {     
                 
//                  if(arr[i] == arr[i+1])
//                     {
//                         count++;
                     
//                     }
//                 }              
//         }
//         return count; 
        
     // pattern 2    
        
        // Set<Integer> set = new HashSet<>();
        // for(int value : arr)
        // {
        //      set.add(value);
        // }
        //   for(int i : arr)
        // {
        //      if(set.contains(i+1))
        //      {
        //         count++; 
        //      }
        // }  
        // return count; 
        
      // pattern 3
        
         Set<Integer> set = new HashSet<>();
         for (int value = 0; value < arr.length; value++) {
           set.add(arr[value]);
        }
         int count = 0; 
          for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + 1))
                count++;
        }
  return count; 
    }
}