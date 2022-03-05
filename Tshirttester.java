package contructor;

public class Tshirttester {
	public static void main(String[] args)
	{
	System.out.println("invoked main method");
	String brand="polo";
	double price=500.0d;
	Tshirt tshirt=new Tshirt(brand,"red",price);
	String tbrand=tshirt.brand;
	String tcolor=tshirt.color;
	double tprice=tshirt.price;
	System.out.println("tbrand="+tbrand);
	System.out.println("tcolor="+tcolor);
	System.out.println("tprice="+tprice);
	System.out.println(".........................");
	Tshirt tshirt1=new Tshirt("nike","blue","good",'M',750.0d);
	System.out.println(tshirt1.brand);
	System.out.println(tshirt1.color);
	System.out.println(tshirt1.quality);
	System.out.println(tshirt1.gender);
	System.out.println(tshirt1.price);
	Tshirt tshirt2=new Tshirt("cotton");
	
	}

}
