//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package G44_Array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class ParentClass {
    protected static String parentName;

    public ParentClass(String parentName) {
        ParentClass.parentName = parentName;
    }

    public ParentClass() {
    }
    protected final static Logger LOGParent = LogManager.getLogger(ParentClass.class);
    public static void print(ParentClass father) {
        LOGParent.info(parentName + ": Выведен текст");
    }

    public static void getArrayListParent(List<String> parentArray) {
        try {
            String str = parentArray.toString();
            String[] var2 = str.split(" ");
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String retval = var2[var4];
                System.out.println();
                char[] strToArray = retval.toCharArray();

                for(int i = 0; i < strToArray.length; ++i) {
//                    System.out.print(strToArray[i] + " ");
                    LOGParent.error(strToArray[i] + " ");
                }
            }
        } catch (NullPointerException var8) {
            LOGParent.error(var8.getMessage());
            LOGParent.error("Массив не определён. Пожалуйста проверьте корректность вводимых значений");
            var8.printStackTrace();
        }
           catch (Exception var8) {
            LOGParent.error(var8.getMessage());
            LOGParent.error("Произошла неизвестная ошибка. Подробнее: ");
            var8.printStackTrace();

        }

    }
}
