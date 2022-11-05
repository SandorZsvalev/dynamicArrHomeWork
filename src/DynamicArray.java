import java.util.Arrays;
import java.util.Objects;

public class DynamicArray <E> implements Dynamic <E> {

//    private int [] array;
    private Object[] array;

    private int count; // не успел разобраться в смысле применения
    private int size;

    private static final Object[] emptyArray = {};

    public DynamicArray() {
        this.array = emptyArray;
    }

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new Object[capacity];
        } else if (capacity == 0) {
            this.array = emptyArray;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    capacity);
        }
    }


    @Override
    public void add(E e) {
       if (array.length == size){
           growSize();
       }
       array[size] = e;
       size++;
    }

    @Override
    public void add(int index, E e) {
        checkIndexInRow(index);
        if (array.length == size){
            growSize();
        }
        System.arraycopy(array, index, array, index+1,size-index);
        array[index]=e;
        size++;
    }

    @Override
    public void remove(E e) {
        int neuSize = size-1;
        for(int i=0; i<size; i++){
            if (array[i].equals(e)){
                System.arraycopy(array, i+1, array, i,neuSize-i);
                array[neuSize]=null;
                size = neuSize;
               return;
            }
        }
        System.out.println("Element not found");
    }

    @Override
    public void removeAt(int index) {
        Objects.checkIndex(index, size);
        System.arraycopy(array, index+1, array, index,size-index);
        size--;
    }

    @Override
    public void growSize() {
        int oldSize = array.length;
        int neuSize = (oldSize*2)+1;
        Object[] newArray = new Object[neuSize];
        System.arraycopy(array, 0, newArray, 0,size);
        array = newArray;
    }

    @Override
    public void shrinkSize() {
        array=Arrays.copyOf(array,size);

    }

    @Override
    public void set(int index, E e) {
        Objects.checkIndex(index, size);
        array[index]=e;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return (E) array[index];
    }

    @Override
    public void clear() {
        int elNum=size;
        for(int i=0; i<elNum; i++){
            array[i]=null;
            size--;
            }
        }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndexInRow (int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
