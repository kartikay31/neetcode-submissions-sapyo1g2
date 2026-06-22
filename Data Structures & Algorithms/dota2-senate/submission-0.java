class Solution {
    public String predictPartyVictory(String senate) {

     Queue<Integer> rc  = new LinkedList<Integer>();
     Queue<Integer> dc  = new LinkedList<Integer>();
     for(int i = 0 ; i<senate.length() ; i++){
        if(senate.charAt(i)=='R'){
            rc.offer(i);
        }else{
            dc.offer(i);
        }
     }
    
    while(!rc.isEmpty() && !dc.isEmpty()){
        if(rc.peek()>dc.peek()){
            rc.poll();
            dc.offer(dc.peek()+senate.length());
            dc.poll();
        } else {
             dc.poll();
            rc.offer(rc.peek()+senate.length());
            rc.poll();
        }
    }

    if(rc.isEmpty()){
        return "Dire";
    }else{
        return "Radiant";
    }
    }
}