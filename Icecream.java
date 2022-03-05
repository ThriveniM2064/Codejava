package method;

public class Icecream {
	String flavour;
	String quantity;
	int price;
	enum color{
		PINK,GREEN,YELLOW,BROWN
	}
	String brand;
	enum packingType{
		CUBS,TUBS,CONES,WRAPPERS
	}
	void update()
	{
		System.out.println("UPDATE ALL METHODS");
		System.out.println(this.flavour);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(color.PINK);
		System.out.println(this.brand);
		System.out.println(packingType.CUBS);
	}
	String getFlavour()
	{
		System.out.println("RUNNING GETFLAVOUR");
		return this.flavour;
	}
	String getquantity()
	{
		System.out.println("RUNNING GETQUANTITY");
		return this.quantity;
	}
	int getprice()
	{
		System.out.println("RUNNING GETPRICE");
		return this.price;
	}
	color getcolor()
	{
		System.out.println("RUNNING GETCOLOR");
		return color.PINK;
	}
	String getbrand()
	{
		System.out.println("RUNNING GETBRAND");
		return this.brand;
	}
	packingType getpackingType()
	{
		System.out.println("RUNNING GETPACKINGTYPE");
		return packingType.CONES;
	}

}
