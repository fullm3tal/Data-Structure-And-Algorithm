package leetcode.arrays;

public class QueryList<T> {

    T[] data;
    int defaultCapacity = 10;
    private int currentIndex = -1;

    public QueryList(int capacity) {
        if (capacity > 0) {
            data = (T[]) new Object[capacity];
        } else {
            data = (T[]) new Object[defaultCapacity];
        }
    }

    public QueryList() {
        data = (T[]) new Object[defaultCapacity];
    }

    public void add(T element) {
        if (currentIndex < 0) {
            currentIndex = 0;
        }
        data[currentIndex] = element;
        currentIndex++;
    }

    public int size() {
        return currentIndex;
    }

    public T get(int index) {
        return data[index];
    }

    public void delete(int index) {
        T itemAtIndex = data[index];
        shiftItems(index);
    }

    private void shiftItems(int index) {
        for (int i = index; i < currentIndex; i++) {
            data[i] = data[i + 1];
        }
        currentIndex--;
    }

    @Override
    public String toString() {
        StringBuilder dataInStringFormat = new StringBuilder();
        for (int i = 0; i < currentIndex; i++) {
            dataInStringFormat.append(data[i]).append(" ");
        }
        return dataInStringFormat.toString().trim();
    }
}
