package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {

    List<SomeType> stack = new ArrayList<>();

    public MyStack() { }

    public Boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(SomeType i) {
        stack.add(i);
    }

    public SomeType peek() {
        if(isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public SomeType pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return stack.iterator();
    }
}
