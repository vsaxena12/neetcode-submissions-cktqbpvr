class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;

        for(int num: nums) {
            if(count1 == 0) {
                count1++;
                num1 = num;
            } else if(count2 == 0) {
                count2++;
                num2 = num;
            } else if(num == num1) {
                count1++;
            } else if(num == num2) {
                count2++;
            }
        }

        count1 = count2 = 0;

        for(int num: nums) {
            if(num == num1) {
                count1++;
            } else if(num == num2) {
                count2++;
            }
        }

        List<Integer> list = new ArrayList<>();
        if (count1 > n / 3) 
            list.add(num1);
        if (count2 > n / 3) 
            list.add(num2);

        return list;
    }
}