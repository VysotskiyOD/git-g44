//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package G44_Array;

import java.util.List;

public class ParentClass {
    protected static String parentName;

    public ParentClass(String parentName) {
        ParentClass.parentName = parentName;
    }

    public ParentClass() {
    }

    public static void print(ParentClass father) {
        System.out.println(parentName + ": Выведен текст");
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
                    System.out.print(strToArray[i] + " ");
                }
            }
        } catch (NullPointerException var8) {
            System.out.println(var8.getMessage());
            System.out.println("Массив не определён. Пожалуйста проверьте корректность вводимых значений");
        }

    }
}
