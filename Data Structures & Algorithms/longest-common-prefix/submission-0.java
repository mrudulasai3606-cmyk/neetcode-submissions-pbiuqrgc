class Solution {
    public String longestCommonPrefix(String[] s) {
        int n = s.length;
        Arrays.sort(s);
        char ch1[] = s[0].toCharArray();
        char ch2[] = s[n-1].toCharArray();
        int min= Math.min(ch1.length,ch2.length);
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<min;i++){
            if(ch1[i]==ch2[i]){
                sb.append(ch1[i]);
            }else{
                break;
            }
        }
        return sb.toString();
    }
}