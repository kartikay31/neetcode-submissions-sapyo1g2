class MyHashSet {
    List<Integer>[] buckets ;
     int M  = 1009;
    public MyHashSet() {
      
         buckets = (List<Integer>[]) new List[M];
        for(int i = 0 ; i <M ; i++ ){
            buckets[i] = new ArrayList<>();
        }
    }

    private int hash(int key){
        return key % M ;
    }
    
    public void add(int key) {
        int i  = hash(key);
        List<Integer> list  = buckets[i];
        if(!list.contains(key)){
            list.add(key);
        }
        

    }
    
    public void remove(int key) {
          int i  = hash(key);
        List<Integer> list  = buckets[i];
        if(list.contains(key)){
              list.remove(Integer.valueOf(key));
        }
      
    }
    
    public boolean contains(int key) {
        int i  = hash(key);
        List<Integer> list  = buckets[i];
        if(list.contains(key)){
            return true ;
        } 
        return false ;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */