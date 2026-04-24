class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<people.length; i++) {
            int compliment = limit - people[i];
            if(compliment == 0) {
                list.add(new int[]{people[i]});
            }
            if(map.containsKey(compliment)) {
                list.add(new int[]{compliment, map.get(compliment)});
            }
            map.put(people[i], compliment);
        }

        return list.size();
    }
}