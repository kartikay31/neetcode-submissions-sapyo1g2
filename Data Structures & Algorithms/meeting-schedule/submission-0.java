/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparing((Interval i )-> i.start));
        int max = 0 ;
        boolean res = true ;
        for(Interval i : intervals){
            if(i.start<max){
                res = false ;
                break ;
            }
            if(i.end>max){
                max = i.end;
            }
        }
        return res;
    }
}
