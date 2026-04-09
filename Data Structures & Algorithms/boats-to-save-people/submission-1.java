class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int minBoats = 0;

        while(i<=j) {
            if(i<j && limit >= people[j] + people[i]) {
                i++;
                j--;
                
            } else {
                j--;
            }
            minBoats++;
        }

        return minBoats;
    }
}