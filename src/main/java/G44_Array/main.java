//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package G44_Array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class main {
    private final static Logger LOG = LogManager.getLogger(main.class);
    public static void main(String[] args) {
//        System.out.println("Hello");
        LOG.info(String.format("Hello"));
        LOG.info(String.format("Original order  " + arrayToList.getArrayList1()));
        arrayList.printListString(arrayToList.getArrayList1());
        new arrayToList();
        new arrayToList("vasa", 3);
        ParentClass.print(new ParentClass("Father"));
        ParentClass.getArrayListParent(arrayToList.getArrayList1());
        ParentClass.getArrayListParent((List)null);
        ArrayList<String> myArrayList = new ArrayList();
        myArrayList.add("one");
        myArrayList.add("two");
        ParentClass.getArrayListParent(myArrayList);

    }
}
