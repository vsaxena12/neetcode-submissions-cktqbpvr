class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int day=0; day<temperatures.length; day++) {
            for(int future=day+1; future<temperatures.length; future++) {
                if(temperatures[future] > temperatures[day]) {
                    result[day] = future - day;
                    break;
                }
            }
        }
        return result;
    }
}