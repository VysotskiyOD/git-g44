//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package G44_Array;

import java.util.ArrayList;
import java.util.List;

public class arrayToList extends ParentClass {
    private String nameArrayToList;
    private int numberArrayToList;
    public static String[] myArray1 = new String[]{"seven", "six", "eight", "four", "five", "nine"};

    public arrayToList() {
        System.out.println("Новый пустой экземпляр класса " + this.getClass().getName());
    }

    public arrayToList(String name, int number) {
        this.nameArrayToList = name;
        this.numberArrayToList = number;
    }

    public static List<String> getArrayList1() {
        ArrayList<String> getArray1 = new ArrayList();

        for(int i = 0; i <= 4; ++i) {
            getArray1.add(myArray1[i]);
        }

        return getArray1;
    }
}
