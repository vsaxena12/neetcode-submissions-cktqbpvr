class Solution {
    public int subarraySum(int[] nums, int k) {
        //[2, -1, 1, 2]
        // i      j
        int sum = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        int result = 0;
        for(int n: nums) {
            sum = sum + n;
            int diff = sum - k;
            result = result + hash.getOrDefault(diff, 0);
            hash.put(sum, hash.getOrDefault(sum, 0)+1);
        }
        return result;
        // int res = 0, curSum = 0;
        // Map<Integer, Integer> prefixSums = new HashMap<>();
        // prefixSums.put(0, 1);

        // for (int num : nums) {
        //     curSum += num;
        //     int diff = curSum - k;
        //     res += prefixSums.getOrDefault(diff, 0);
        //     prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        // }

        // return res;
    }
}