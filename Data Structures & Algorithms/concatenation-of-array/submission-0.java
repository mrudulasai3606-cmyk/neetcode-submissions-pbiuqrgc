class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int n1 = n+n;
        int ans[] = new int[n1];
        for(int i=0;i<n;i++ ){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
       
        return ans;
    }
}