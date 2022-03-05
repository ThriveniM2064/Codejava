package method;

public class Headset {
	enum type{ONEPLUS,BOAT,SONY};
	double price;
	double volume;
	Headset(){
		System.out.println("running default");
	}
Headset(double volume)
{
	this.volume=volume;
	System.out.println("running param");
}
void Displaydetails() {
	System.out.println("running methods");
	System.out.println(type.BOAT);
	System.out.println(price);
	System.out.println(volume);
}
void Changevolume()
{
	System.out.println("BEFORE CHANGING VOLUME");
	System.out.println(volume);
	volume=volume+30;
	System.out.println("AFTER CHANGING VOLUME");
	System.out.println(volume);
}
}
