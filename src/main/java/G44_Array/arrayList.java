//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package G44_Array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;

public class arrayList extends ParentClass {
    private final static Logger LOGParent = LogManager.getLogger(arrayList.class);
    private String nameArrayList;
    private int numberArrayList;

    public arrayList() {
        LOGParent.info("Новый пустой экземпляр класса " + this.getClass().getName());
    }

    public arrayList(String name, int number) {
        this.nameArrayList = name;
        this.numberArrayList = number;
    }

    public static void printListString(List<String> myListString) {
        myListString.sort(Comparator.comparing(String::toString));
        LOGParent.info(String.format("Natural order " + myListString));
        myListString.sort(Comparator.comparing(String::toString).reversed());
        LOGParent.info(String.format("Reverse order " + myListString));
    }
}
