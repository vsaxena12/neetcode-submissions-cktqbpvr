class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int left = 0;
        int right = numbers.length-1;

        while(left < right) {
            if(numbers[left] + numbers[right] == target) {
                result[0] = numbers[left];
                result[1] = numbers[right];
                break;
            } else if(numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
