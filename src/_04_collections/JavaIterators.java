package _04_collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class JavaIterators {

	public static void main(String[] args) {
		 Vector v = new Vector();
		 for(int i=0;i<10;i++)
			 v.add(i);
		 System.out.println(v);
		 
		 Enumeration e = v.elements();	//enumeration
		 while(e.hasMoreElements())
			 System.out.print(e.nextElement() + ", ");
		 System.out.println();
		 
		 ArrayList<Integer> al = new ArrayList<>();
		 for(int i=0;i<10;i++)
			 al.add(i);
		 System.out.println(al);
		 
		 Iterator it = al.iterator();		//iterator
		 while(it.hasNext())
			 System.out.print(it.next() + ", ");
		 System.out.println();
		 
		 ArrayList<Integer> al2 = new ArrayList<>();
		 for(int i=0;i<10;i++)
			 al2.add(i);
		 System.out.println(al2);
		 
		 ListIterator li = al.listIterator();		//iterator
		 while(li.hasNext()) {
			 int a = (int) li.next();
			 System.out.print(a + ", ");
			 if(a%2==0) {
				 a++;
				 li.set(a);
				 li.add(a);
			 }
		 }
		 System.out.println();
		 System.out.println(al2);
		 
		 
	}
}
