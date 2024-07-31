package interview.test;

import java.util.*;

public class CollectionTest {

    public static void testHashMap() {
        // HashMap allows one null key
        HashMap hm = new HashMap();
        hm.put(null, 1);    // allowed

        Set s = hm.keySet();
        Iterator itr = s.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public static void testHashtable() {
        try {
            // Hashtable does not allow null key
            Hashtable ht = new Hashtable();
            ht.put(null, 1);    // not allowed

            Set s2 = ht.keySet();
            Iterator itr2 = s2.iterator();

            while (itr2.hasNext())
                System.out.println(itr2.next());

        } catch (NullPointerException e) {
            System.out.println("Null key not allowed in Hashtable: " + e.getClass());
        }
    }

    public static void testSet() {
        try {
            Set set = new TreeSet();
            set.add("2");
            set.add(3);
            set.add("1");
            Iterator it = set.iterator();

            while (it.hasNext())
                System.out.println(it.next() + " ");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass());
        }
    }

    public static void testList() {
        List list = new ArrayList();
        list.add("hello");
        list.add(2);
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Object);
    }

    public static void main(String[] args) {
        testHashMap();
        testHashtable();
        testSet();
        testList();
    }
}
