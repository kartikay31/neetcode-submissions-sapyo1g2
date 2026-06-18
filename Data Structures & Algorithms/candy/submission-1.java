class Solution {
    public int candy(int[] ratings) {
        int[] a = new int[ratings.length];
        for(int i = 0 ; i<ratings.length ; i++){
            a[i] = 1;
        }

        for(int i = 1 ; i<ratings.length ; i++){
            if(ratings[i]>ratings[i-1]){
                a[i] = a[i-1]+1;
            }
        }

        for(int i = ratings.length-2 ; i>=0 ; i--){
            if(ratings[i]>ratings[i+1]){
                a[i] = Math.max(a[i+1]+1,a[i]);
            }
        }
        int sum = 0 ;
        for(int i = 0 ; i<a.length ; i++){
            sum = sum + a[i];
        }

    return sum ;
    }
}