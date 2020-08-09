//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package G44_Array;

import java.util.Comparator;
import java.util.List;

public class arrayList extends ParentClass {
    private String nameArrayList;
    private int numberArrayList;

    public arrayList() {
        System.out.println("Новый пустой экземпляр класса " + this.getClass().getName());
    }

    public arrayList(String name, int number) {
        this.nameArrayList = name;
        this.numberArrayList = number;
    }

    public static void printListString(List<String> myListString) {
        myListString.sort(Comparator.comparing(String::toString));
        System.out.println("Natural order " + myListString);
        myListString.sort(Comparator.comparing(String::toString).reversed());
        System.out.println("Reverse order " + myListString);
    }
}
