class MyHashMap {
    HashMap<Integer, Integer> hs;

    public MyHashMap() {
        hs = new HashMap<>();
    }
    
    public void put(int key, int value) {
        hs.put(key, value);
    }
    
    public int get(int key) {
        return hs.containsKey(key) ? hs.get(key) : -1;
    }
    
    public void remove(int key) {
        this.hs.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */