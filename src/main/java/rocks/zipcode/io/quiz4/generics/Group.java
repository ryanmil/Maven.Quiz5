package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>{
    List<T> list = new ArrayList<>();

    public Group() {

    }

    public Integer count() {
        return list.size();
    }

    public void insert(T value) {
        list.add(value);
    }

    public void insert(Integer index, T value) {
        list.add(index, value);
    }

    public Boolean has(T value) {
        return list.contains(value);
    }

    public T fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(T value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i).toString());
            if(i != list.size() -1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public Integer indexOf(T value) {
        return list.indexOf(value);
    }
}
