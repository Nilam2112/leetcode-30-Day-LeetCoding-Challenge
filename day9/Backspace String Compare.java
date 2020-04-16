class Solution {
    public boolean backspaceCompare(String S, String T) {
       
//        apporch1 but not working
        // for(int i = 0; i<S.length(); i++)
        // {
        //      String A, B;
        //     String str = "#";    
        //     if(S.charAt(i) == str.charAt(0))
        //     {
        //     char c = S.charAt(i-1);  
        //       S=S.replace(S.charAt(i-1),'#'); 
        //     S.replace("#", "");     
        //     }
        //      if(T.charAt(i) == str.charAt(0))
        //     {
        //     char c2 = T.charAt(i-1);         
        //      T=T.replace(T.charAt(i-1),'#');
        //         T.replace("#", "");             
        //     }
        // }
        //    if(S.compareTo(T) == 0)
        // {
        //      return true;
        // }   
        // else{
        //     return false;
        // } 
        
      //        apporch2 
        
return remove_Back_Space(S).equals(remove_Back_Space(T));
}

private static String remove_Back_Space(String s) {
	StringBuilder s1 = new StringBuilder();
	int count = 0;
	for (int i = s.length() - 1; i >= 0; i--)
   
    {
		if (s.charAt(i) == '#') 
        {
			count++;
		}
        else 
        {
			if (count > 0)
                {
                    count--;
                } 
            else 
                {
//              S="ab#c",T ="ad#c"    
                // first append c, then ingnore #, than b, then append a ,so output string is "ac"  for S string 
                s1.append(s.charAt(i));
                }
		}
	}
	return s1.toString();
        
    }
}