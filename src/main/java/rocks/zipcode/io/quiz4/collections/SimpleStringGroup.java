package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    List<String> strs = new ArrayList<>();

    public SimpleStringGroup() {

    }

    public Integer count() {
        return strs.size();
    }

    public void insert(String string) {
        strs.add(string);
    }

    public Boolean has(String string) {
        return strs.contains(string);
    }

    public String fetch(int indexOfValue) {
        return strs.get(indexOfValue);
    }

    public void delete(String string) {
        strs.remove(string);
    }

    public void clear() {
        strs.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return strs.iterator();
    }
}
