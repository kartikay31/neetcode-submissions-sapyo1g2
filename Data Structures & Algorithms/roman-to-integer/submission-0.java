class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> intS = new HashMap<>();
        intS.put('I',1);
        intS.put('V',5);
        intS.put('X',10);
        intS.put('L',50);
        intS.put('C',100);
        intS.put('D',500);
        intS.put('M',1000);
        int total  = 0 ;
        for(int i =0 ; i< s.length() ; i++){
            char c = s.charAt(i);
            int curr = intS.get(c);
            int next = 0 ;
            if(i+1<s.length()){
                next = intS.get(s.charAt(i+1));
            }
            if(next<=curr){
                total = total+ curr;
            }else{
                 total = total- curr;
            }


        }
        return total;
        
    }
}