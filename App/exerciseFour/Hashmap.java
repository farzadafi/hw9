package App.exerciseFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hashmap<K, V> {
    private int CAPACITY = 10;
    private MyMapBucket[] bucket;
    private int size = 0;
    private List<K> list = new ArrayList<>();

    public Hashmap() {
        this.bucket = new MyMapBucket[CAPACITY];
    }
    private int getHash(K key) {
        return (key.hashCode() & 0xfffffff) % CAPACITY;
    }

    private MyKeyValueEntry getEntry(K key) {
        int hash = getHash(key);
        for (int i = 0; i < bucket[hash].getEntries().size(); i++) {
            MyKeyValueEntry myKeyValueEntry = bucket[hash].getEntries().get(i);
            if(myKeyValueEntry.getKey().equals(key)) {
                return myKeyValueEntry;
            }
        }
        return null;
    }
    public void put(K key, V value) {
        if(containsKey(key)) {
            MyKeyValueEntry entry = getEntry(key);
            entry.setValue(value);
        } else {
            int hash = getHash(key);
            if(bucket[hash] == null) {
                bucket[hash] = new MyMapBucket();
            }
            bucket[hash].addEntry(new MyKeyValueEntry<>(key, value));
            size++;
            list.add(key);
        }
    }

    public V get(K key) {
        return containsKey(key) ? (V) getEntry(key).getValue() : null;
    }

    public boolean containsKey(K key) {
        int hash = getHash(key);
        return !(Objects.isNull(bucket[hash]) || Objects.isNull(getEntry(key)));
    }

    public void delete(K key) {
        if(containsKey(key)) {
            int hash = getHash(key);
            bucket[hash].removeEntry(getEntry(key));
            size--;
            list.remove(key);
        }
    }
    public int size() {
        return size;
    }

    public boolean isEmpty(){
        if(size() == 0 )
            return true;
        else
            return false;
    }

    public void getAllValue(){
        for (K k:list
        ) {
            System.out.println(get(k));
        }
    }
}
