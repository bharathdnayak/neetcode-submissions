class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(numbers[0],1);
        for(int i=1;i<n;i++){
            int need=target-numbers[i];
                if(map.containsKey(need)){
                    return new int[]{map.get(need),i+1};
                }
            map.put(numbers[i],i+1);
                
        }
        return new int[]{-1,-1};
    }
}
