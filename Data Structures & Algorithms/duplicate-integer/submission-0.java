class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])) return true;
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}