package method;

public class Shoe {
	 enum size{SEVEN,EIGHT,NINE,TEN}
	double price;
	String brand;
	enum type{ SANDAL,BOOT,SNEAKERS,BALLETFLAT}
	Shoe()
	{
		System.out.println("running default");
	}
	Shoe(double price){
		this.price=price;
		System.out.println("running param");
	}
	void Displaydetails()
	{
		System.out.println("running mathods");
		System.out.println(size.SEVEN);
		System.out.println(brand);
		System.out.println(type.SNEAKERS);
		
	}
	void Changeprice()
	{
		System.out.println("BEFORE CHANGING THE PRICE=");
		System.out.println(price);
		price=price*2;
		System.out.println("AFTER CHANGING THE PRICE=");
		System.out.println(price);
		
	}
	

}
