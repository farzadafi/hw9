package App.exerciseFour;

import java.util.LinkedList;
import java.util.List;

public class myMapBucket {
    private List<myKeyValueEntry> entries;

    public myMapBucket() {
        if(entries == null) {
            entries = new LinkedList<>();
        }
    }

    public List<myKeyValueEntry> getEntries() {
        return entries;
    }

    public void addEntry(myKeyValueEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(myKeyValueEntry entry) {
        this.entries.remove(entry);
    }


}

