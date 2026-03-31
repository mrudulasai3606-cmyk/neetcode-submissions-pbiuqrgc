class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int ele =0;
        int c=0;
        for(int i=0;i<n;i++){
            if(c==0){
                ele = arr[i];
                c++;
            }
            else if(arr[i]==ele){
                c++;
            }
            else{
                c--;
            }
        }
        return ele;
    }
}