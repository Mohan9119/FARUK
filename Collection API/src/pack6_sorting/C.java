package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator
{
    String str1, str2;

    C(String str1, String str2)
    {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "MyClassC{str1= " + str1 + ", str2= " + str2 + "}";
    }
}

class SortBasedOnStr1Value implements Comparator<C>
{
    @Override
    public int compare(C o1, C o2) {
        return o1.str1.compareTo(o2.str1);
    }
}

class SortBasedOnStr2Value implements Comparator<C>
{
    @Override
    public int compare(C o1, C o2) {
        return o1.str2.compareTo(o2.str2);
    }
}

 class C {
    public static void main(String[] args) {
        ArrayList<C> L = new ArrayList<>();
        L.add(new C("abc", "def"));
        L.add(new C("ghi", "jkl"));
        L.add(new C("mno", "pqr"));
        L.add(new C("stu", "vwx"));
        System.out.println(L);

        Collections.sort(L, new SortBasedOnStr1Value());
        System.out.println(L);

        Collections.sort(L, new SortBasedOnStr2Value());
        System.out.println(L);
    }
}