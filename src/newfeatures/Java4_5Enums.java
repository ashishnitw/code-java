
interface MobileCompany{		//earlier we used to use interface
	String APPLE = "Apple";
	String MOTO = "Motorola";
}
enum Mobile{	//every enum extends Enum class (abstract class)
	APPLE(100), SAMSUNG(50), HTC;	//enum is optional
	int price;		//variable
	Mobile(){
		price = 80;
		System.out.println("Default Constructor");
	}
	Mobile(int price){
		this.price = price;
		System.out.println("Price Constructor");
	}
	
	public void showPrice() {
		System.out.println("Price: " + price);
	}
}
//class Mobile{				//behind the scenes
//	static final Mobile APPLE = new Mobile();
//	static final Mobile SAMSUNG = new Mobile();
//	static final Mobile HTC = new Mobile();
//}
public class Java4_5Enums {
	public static void main(String[] args) {
		
		Mobile m = Mobile.APPLE;
		switch(m) {
		case APPLE:
			System.out.println(Mobile.APPLE); break;
		case SAMSUNG:
			System.out.println(Mobile.SAMSUNG); break;
		case HTC:
			System.out.println(Mobile.HTC); break;
		}
		
		System.out.println("Name: " + Mobile.HTC.name());
		System.out.println("Ordinal: " + Mobile.HTC.ordinal());
		
		Mobile a[] = Mobile.values();	//values method given by JVM, it is not defined anywhere
		for(Mobile i : a)
			System.out.println(i);
		
	}
}
