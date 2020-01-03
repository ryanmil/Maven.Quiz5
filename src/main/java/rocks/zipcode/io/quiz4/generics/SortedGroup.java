package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {
    @Override
    public void insert(T value) {
        if(this.count() == 0) {
            super.insert(value);
        } else {
            for (int i = 0; i < this.count(); i++) {
                if (value.compareTo(this.fetch(i)) < 0) {
                    super.insert(i, value);
                    break;
                }
            }
        }
    }

    /*
    @Override
    public void delete(T value) {
    }*/
}
