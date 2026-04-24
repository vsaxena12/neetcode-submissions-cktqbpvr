class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;

        for(int num: nums) {
            if(count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if(count2 == 0) {
                num2 = num;
                count2 = 1;
            } else if(num == num1) {
                count1++;
            } else if(num == num2) {
                count2++;
            } else {
                count1--;
                count2--;
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
        
            list.add(num1);
            list.add(num2);

        return list;
    }
}