
import java.util.Optional;

public class Java8OptionalClass {
	public static void main(String[] args) {
		String[] str = new String[10];
		//System.out.println(str[3].toLowerCase());	//null pointer exception
		
		str[3] = "ASHISH RANJAN";
		
		Optional<String> checkNull = Optional.ofNullable(str[3]);
		if(checkNull.isPresent()) {
			System.out.println(str[3].toLowerCase());
		}
		else
			System.out.println("string value not present");
		
		checkNull.ifPresent(System.out::println);   // printing value by using method reference
		System.out.println(checkNull.get());    // printing value by using get method  
		
		
	}
}
