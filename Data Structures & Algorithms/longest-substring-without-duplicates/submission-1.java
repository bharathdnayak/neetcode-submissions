class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int n=s.length();
        int l=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                while(s.charAt(l)!=s.charAt(i)){
                    map.remove(s.charAt(l));
                    l++;
                }
                
                l++;
            }
            map.put(s.charAt(i),i);
            ans=Math.max(ans,i-l+1);

        }
        return ans;
    }
}
