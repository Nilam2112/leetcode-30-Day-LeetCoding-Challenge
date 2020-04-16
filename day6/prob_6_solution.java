class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result_1 = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str: strs)
        {
            char[] arr = new char[26];
            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)-'a']++;
            }
            String ns1 = new String(arr);

            if(map.containsKey(ns1)){
                map.get(ns1).add(str);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(ns1, al);
            }
        }
 
    result_1.addAll(map.values());
 
    return result_1;
    }
}