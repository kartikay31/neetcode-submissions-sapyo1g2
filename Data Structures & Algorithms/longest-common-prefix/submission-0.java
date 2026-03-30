class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder sb = new StringBuilder(strs[0]);
        for(int i =1 ; i <n ;i++){
            while (sb.length()!=0){
                if(strs[i].contains(sb.toString())){
                    break ;
                }else{
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            if(sb.length()==0){
                return "";
            }
        }
        return sb.toString() ;
    }
}