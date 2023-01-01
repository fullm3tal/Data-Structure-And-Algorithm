package leetcode.arrays;


import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    String[] orderedValues;
    int index = 0;
    int len = 0;

    public OrderedStream(int n) {
        orderedValues = new String[n + 1];
        len = orderedValues.length;
    }

    public List<String> insert(int idKey, String value) {
        List<String> newList = new ArrayList<>();
        orderedValues[idKey - 1] = value;
        if (index < len  && orderedValues[index] != null) {
            while (orderedValues[index] != null) {
                newList.add(orderedValues[index]);
                index++;
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        OrderedStream orderedStream = new OrderedStream(5);
        System.out.println(orderedStream.insert(3, "ccccc"));
        System.out.println(orderedStream.insert(1, "aaaaa"));
        System.out.println(orderedStream.insert(2, "bbbbb"));
        System.out.println(orderedStream.insert(5, "eeeee"));
        System.out.println(orderedStream.insert(4, "ddddd"));
    }


}

