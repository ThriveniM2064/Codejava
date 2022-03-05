package contructor;

public class Tshirt {
	 int size;
	 String brand;
	 String color;
	 String material;
	 String quality;
	 double price;
	 char gender;
	 Tshirt(String matrl)
	 {
		 material=matrl;
		 System.out.println(material+"material");
		 }
	 
	 Tshirt(String brand,String color,double price)
	 {
		 System.out.println("it is a parameterized constructor");
		 System.out.println(brand); 
		 System.out.println(color);
		 System.out.println(price);
		 this.brand=brand;
		 this.color=color;
		 this.price=price;
	 }
	 Tshirt()
	 {
		 quality="good";
		 System.out.println("the quality of tshirt is="+quality);
	 }
	 Tshirt(String brand,String color,String quality,char gender,double price){
		 this(brand,color,price);
		 System.out.println("this is contruction chaining");
		 System.out.println(quality);
		 System.out.println(gender);
	 }
	 

}
