package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();		//unordered
		hm.put("one", "practice.geeksforgeeks.org");
		hm.put("two", "code.geeksforgeeks.org");
        hm.put("four", "quiz.geeksforgeeks.org");
        System.out.println(hm);
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();	//ordered
		lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "quiz.geeksforgeeks.org");
        System.out.println(lhm);
		
        TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();	//sorted
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        for (int i = 0; i < arr.length; i++)
        {
            Integer c = tmap.get(arr[i]);
            if (tmap.get(arr[i]) == null)
               tmap.put(arr[i], 1);
            else
              tmap.put(arr[i], ++c);
        }
        for (Map.Entry m:tmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
        
        //EnumMap
        
        //test
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(null, "Ashish");
        map.put(null, "Ranjan");
        
        
	}
}
