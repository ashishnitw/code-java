
import java.util.StringJoiner;

public class Java8StringJoiner {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		sj.add("Ashish");
		sj.add("Rishi");
		sj.add("Amit");
		sj.add("Subhash");
		System.out.println(sj);
		
		//adding prefix and suffix
		StringJoiner sj1 = new StringJoiner(":","[","]");
		sj1.add("Ashish");
		sj1.add("Rishi");
		sj1.add("Amit");
		sj1.add("Subhash");
		System.out.println(sj1);
		
		//Merge Two StringJoiner
		StringJoiner merge = sj.merge(sj1); 
		System.out.println(merge);
		
		//StringJoiner Methods
		StringJoiner sj2 = new StringJoiner(":","[","]");
		sj2.setEmptyValue("emplty string");
		System.out.println(sj2);
		
		System.out.println("Length: " + sj1.length());
		String s1 = sj1.toString();
		
		
	}
}
