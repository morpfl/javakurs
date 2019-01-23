import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FibonacciArray implements Set {

    private Set<Integer> array;

    public FibonacciArray(){
        this.array = new HashSet<>();
    }

    @Override
    public int size() {
        return this.array.size();
    }

    @Override
    public boolean isEmpty() {
        return this.array.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.array.contains(o);
    }

    @Override
    public Iterator iterator() {
        return this.array.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.array.toArray();
    }

    @Override
    public boolean add(Object o) throws NoFibonacciException{
        if(o == null || o.getClass() != Integer.class){
            throw new NoFibonacciException();
        }
        int f = (int) o;
        if(!checkIfFibonacci(f)){
            throw new NoFibonacciException();
        }
        return this.array.add(f);
    }

    @Override
    public boolean remove(Object o) {
        return this.array.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        for(Object o : c){
            this.add(o);
        }
        return true;
    }

    @Override
    public void clear() {
        this.array.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return this.array.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return this.array.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return this.array.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return this.array.toArray(a);
    }

    private boolean checkIfFibonacci(int i) {
        if (i < 0) {
            return false;
        } else if (i == 0 || i == 1) {
            return true;
        } else {
            int fib = 1;
            int previousFib = 1;
            int temp;
            while (fib < i) {
                temp = previousFib;
                previousFib = fib;
                fib = fib + temp;
            }
            return (i == fib);
        }
    }
}
