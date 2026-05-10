class TimeMap {

    Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(timestamp, value);
        map.computeIfAbsent(key, k -> treeMap);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";

        TreeMap<Integer, String> timestamps = map.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);

        return entry == null ? "" : entry.getValue();
    }
}
