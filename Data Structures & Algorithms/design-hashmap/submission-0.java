class MyHashMap {
    private static class Node{
        int key ;
        int value ;
        Node(int k , int v){
            key = k ;
            value  = v ;
        }
    }
    List<Node>[] buckets ;
    int M  = 1009;
     
    public MyHashMap() {
        buckets = (List<Node>[]) new List[M];
        for(int i = 0 ; i <M ; i++ ){
            buckets[i] = new ArrayList<>();
        }
        
    }
    
    public void put(int key, int value) {
        Node n  =  new Node(key,value);
        int i  = key % M ;
        List<Node> nodel  = buckets[i] ;
         for(Node nm : nodel){
            if(nm.key == key ){
                 nm.value = value ;
                 return ;
            }
          }
        nodel.add(n);
    }
    
    public int get(int key) {
        int i  = key % M ;
          List<Node> nodel  = buckets[i] ;
           int val  = -1 ;
          for(Node n : nodel){
            if(n.key == key ){
                val  = n.value ;
            }
          }
          return val ;
    }
    
    public void remove(int key) {
          int i  = key % M ;
          List<Node> nodel  = buckets[i] ;
         
          for(Node n : nodel){
            if(n.key == key ){
              nodel.remove(n);
              break;
            }
          }
         
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */