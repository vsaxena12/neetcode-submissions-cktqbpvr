class Solution {
    public int findDuplicate(int[] nums) {
        //[1,3,4,2,2]
        int[] aux = new int[nums.length];

        for(int num: nums) {
            if(aux[num-1] >= 1) {
                return num;
            }
            aux[num-1] = num;
        }
        return -1;
    }
}
