class Solution {
    public int[] sortArray(int[] arr) {
      
        int n = arr.length;
          int res[] = new int[n];
       for(int i=0;i<n;i++){
        res[i] = arr[i];
       }
       Arrays.sort(res);
       return res;
    }
}