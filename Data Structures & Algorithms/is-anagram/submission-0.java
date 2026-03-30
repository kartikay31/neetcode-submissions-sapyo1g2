class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ;
        }
        return convertToFreqCode(s).equals(convertToFreqCode(t));
            
        
        
    }

    public String convertToFreqCode(String s){
        int[] sf = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch  = s.charAt(i);
            sf[ch-'a']++;
        }
        StringBuffer sb = new StringBuffer();
        for(int num : sf){
            sb.append(num).append("*");
        }

        return sb.toString();
    }
}
