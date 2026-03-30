class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num :nums){
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num)+1);
            }else{
                hashMap.put(num,1);
            }
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer,Integer> e : hashMap.entrySet()) {
            int val = e.getKey();
            int frq = e.getValue();
            if (buckets[frq] == null) buckets[frq] = new ArrayList<>();
            buckets[frq].add(val);
        }

        
        int[] res = new int[k];
        int idx = 0;

        for (int f = buckets.length - 1; f >= 0 && idx < k; f--) {
            if (buckets[f] == null) continue;
            for (int val : buckets[f]) {
                res[idx++] = val;
                if (idx == k) break; 
            }
        }
        return res;
    }
}
