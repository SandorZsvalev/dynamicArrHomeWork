import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
        First level: написать интерфейс Dynamic с методами:
        -add(int) void
        -add(index, data) void
        -remove(int) void
        -removeAt(index) void
        -growSize() void
        -shrinkSize() void
        -set(index, data) void
        -get(index) int
        -clear() void
        -contains(data) boolean
        -isEmpty() boolean

        и реализовать класс DynamicArray
        с полями:
        array[] int
        count int
        size int

                конструкторы
        DynamicArray()
        DynamicArray(int capacity)
        */

        DynamicArray<String> stringDynamicArray = new DynamicArray<>();
        stringDynamicArray.add("7");
        stringDynamicArray.add("6");
        stringDynamicArray.add("9");
        stringDynamicArray.add("10");
        System.out.println(stringDynamicArray.get(0));
        System.out.println(stringDynamicArray);

        stringDynamicArray.add(0,"newData");
        System.out.println(stringDynamicArray);

        stringDynamicArray.remove("6");
        System.out.println(stringDynamicArray);

        stringDynamicArray.removeAt(3);
        System.out.println(stringDynamicArray);

        stringDynamicArray.add(3,"6");
        System.out.println(stringDynamicArray);

        stringDynamicArray.shrinkSize();
        System.out.println(stringDynamicArray);

        stringDynamicArray.add(4,"6");
        System.out.println(stringDynamicArray);

        System.out.println(stringDynamicArray.contains("11"));

        stringDynamicArray.clear();
        System.out.println(stringDynamicArray);

        stringDynamicArray.shrinkSize();
        System.out.println(stringDynamicArray);

        System.out.println(stringDynamicArray.isEmpty());

        stringDynamicArray.add("7");
        System.out.println(stringDynamicArray);

        DynamicArray<Integer> integerDynamicArray = new DynamicArray<>(15);
        integerDynamicArray.add(5);
        integerDynamicArray.add(7);
        integerDynamicArray.add(345);
        System.out.println(integerDynamicArray);


    }
}