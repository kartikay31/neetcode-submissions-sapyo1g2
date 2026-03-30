class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map  = new HashMap<>();
        for(String s : strs){
            String subtext = convertToFreqCode(s);
            if(map.containsKey(subtext)){
                List<String> sub = map.get(subtext);
                sub.add(s);
                map.put(subtext,sub);
            }else{
                 List<String> sub = new ArrayList<>();
                 sub.add(s);
                 map.put(subtext,sub);
            }
        }
        List<List<String>> res  = new ArrayList<>();
        for(String key : map.keySet()){
            List<String> result  = map.get(key);
            res.add(result);
        }
        return res ;
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
