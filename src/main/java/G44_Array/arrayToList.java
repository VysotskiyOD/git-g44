//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package G44_Array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class arrayToList extends ParentClass {
    private final static Logger LOGParent = LogManager.getLogger(arrayToList.class);
    private String nameArrayToList;
    private int numberArrayToList;
    public static String[] myArray1 = new String[]{"seven", "six", "eight", "four", "five", "nine"};

    public arrayToList() {
        LOGParent.info("Новый пустой экземпляр класса " + this.getClass().getName());
    }

    public arrayToList(String name, int number) {
        this.nameArrayToList = name;
        this.numberArrayToList = number;
    }

    public static List<String> getArrayList1() {
        ArrayList<String> getArray1 = new ArrayList();

        for(int i = 0; i <= 4; ++i) {
            getArray1.add(myArray1[i]);
            LOGParent.debug(myArray1[i]);
        }

        return getArray1;
    }
}
