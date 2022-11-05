public interface Dynamic <E> {

        void add (E e);
        void add (int index, E e);
        void remove(E e);
        void removeAt(int index);
        void growSize();
        void shrinkSize();
        void set(int index, E e);
        E get (int index);
        void clear();
        boolean contains(E e);
        boolean isEmpty();
}
