class Solution {
    static int sumDigitSquare(int n) 
                { 
                    int square = 0; 
                    while (n > 0)  
                    { 
                        int digit = n % 10; 
                        square += digit * digit; 
                        n = n / 10; 
                    } 
                    return square; 
                } 
  
    public boolean isHappy(int n) 
         {
                while (true)  
                { 
                    if (n == 1)
                        {
                            return true;
                        }
                         
                    n = sumDigitSquare(n); 

                    if (n == 4) 
                        {
                          return false;   
                        }      
                }
         }
    
}//     } 