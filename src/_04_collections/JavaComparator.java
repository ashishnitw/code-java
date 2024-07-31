package _04_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentCompare{
	int roll;
	String name;
	int marks;
	public StudentCompare(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentCompare [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
class SortByName implements Comparator<StudentCompare>{
	@Override
	public int compare(StudentCompare o1, StudentCompare o2) {
		return o1.name.compareTo(o2.name);
	}
}
class SortByMarks implements Comparator<StudentCompare>{
	@Override
	public int compare(StudentCompare o1, StudentCompare o2) {
		return o1.marks - o2.marks;
	}
}
public class JavaComparator {
	public static void main(String[] args) {
		ArrayList<StudentCompare> al = new ArrayList<>();
		al.add(new StudentCompare(4, "Ashish", 45));
		al.add(new StudentCompare(1, "Tilak", 85));
		al.add(new StudentCompare(6, "Ankit", 25));
		al.add(new StudentCompare(3, "Sher", 65));
		
		Collections.sort(al, new SortByName());
		System.out.println("sort by name:");
		for(StudentCompare s : al)
			System.out.println(s.toString());
		
		Collections.sort(al, new SortByMarks());
		System.out.println("sort by marks:");
		for(StudentCompare s : al)
			System.out.println(s.toString());
		
		
		
		
	}
}
