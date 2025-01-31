public class MyHashMap {
    private int capacity;
    int size;
    Object[][][] buckets;

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new Object[capacity][][];
    }

    private int hashKey(Object key) {
        String strKey = key.toString();
        int hashed_key = 0;
        for (int i = 0; i < strKey.length(); i++) {
            hashed_key = (hashed_key + (int) strKey.charAt(i)) % this.capacity;
        }
        return hashed_key;
    }

    public boolean contains(Object key) {
        int hashedKey = hashKey(key);
        Object[][] bucket = this.buckets[hashedKey];
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i][0] == key) {
                return true;
            }
        }
        return false;
    }

    public void put(Object key, Object value) {
        int hashedKey = hashKey(key);
        if (this.buckets[hashedKey] == null) {
            this.buckets[hashedKey] = new Object[0][];
        }

        Object[][] bucket = this.buckets[hashedKey];
        for(int i = 0; i < bucket.length; i++) {
            if (bucket[i][0].equals(key)) {
                bucket[i][1] = value;
                return;
            }
        }
        Object[][] newBucket = new Object[bucket.length + 1][];
        System.arraycopy(bucket, 0, newBucket, 0, bucket.length);
        newBucket[bucket.length] = new Object[]{key, value};
        this.buckets[hashedKey] = newBucket;
        this.size++;
    }

    public void remove(Object key) {
        int hashedKey = hashKey(key);
        Object[][] bucket = this.buckets[hashedKey];
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i][0] == key) {
                Object[][] newBucket = new Object[bucket.length - 1][];
                System.arraycopy(bucket, 0, newBucket, 0, i);
                System.arraycopy(bucket, i + 1, newBucket, i, bucket.length - i - 1);
                this.buckets[hashedKey] = newBucket;
                this.size--;
                return;
            }
        }
    }

    public int size() {
        return this.size;
    }

    public Object[] keys() {
        Object[] keys = new Object[this.size];
        int index = 0;
        for (Object[][] bucket : this.buckets) {
            if (bucket != null) {
                for (Object[] pair : bucket) {
                    keys[index++] = pair[0];
                }
            }
        }
        return keys;
    }

    public Object[] values() {
        Object[] values = new Object[this.size];
        int index = 0;
        for (Object[][] bucket : this.buckets) {
            if (bucket != null) {
                for (Object[] pair : bucket) {
                    values[index++] = pair[1];
                }
            }
        }
        return values;
    }

    public Object[][] items() {
        Object[][] items = new Object[this.size][];
        int index = 0;
        for (Object[][] bucket : this.buckets) {
            if (bucket != null) {
                for (Object[] pair : bucket) {
                    items[index++] = pair;
                }
            }
        }
        return items;
    }
}
