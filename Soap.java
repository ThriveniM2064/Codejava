package method;

public class Soap {
	String name;
	int price;
	String color;
	String size;
	String weight;
	String manfDate;
	float tmf;
	void update()
	{
		System.out.println("Running update method");
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.size);
		System.out.println(this.weight);
		System.out.println(this.manfDate);
		System.out.println(this.tmf);
		}
void updateName(String Name) {
	System.out.println("RUNNING UPDATENAME METHOD");
	System.out.println("BEFORE UPDATE="+name);
	this.name=Name;
	System.out.println("AFTER UPDATE="+Name);
}
void updatePrice(int Price) {
	System.out.println("RUNNING UPDATEPRICE METHOD");
	System.out.println("BEFORE UPDATE="+price);
	this.price=Price;
	System.out.println("AFTER UPDATE="+Price);
}
void updateColor(String Color) {
	System.out.println("RUNNING UPDATECOLOR METHOD");
	System.out.println("BEFORE UPDATE="+color);
	this.color=Color;
	System.out.println("AFTER UPDATE="+Color);
}
void updateSize(String Size) {
	System.out.println("RUNNING UPDATESIZE METHOD");
	System.out.println("BEFORE UPDATE="+size);
	this.size=Size;
	System.out.println("AFTER UPDATE="+Size);
}
void updateWeight(String Weight) {
	System.out.println("RUNNING UPDATEWEIGHT METHOD");
	System.out.println("BEFORE UPDATE="+weight);
	this.weight=Weight;
	System.out.println("AFTER UPDATE="+Weight);
}
void updateManfDate(String ManfDate) {
	System.out.println("RUNNING UPDATEMANFDATE METHOD");
	System.out.println("BEFORE UPDATE="+manfDate);
	this.manfDate=ManfDate;
	System.out.println("AFTER UPDATE="+ManfDate);
}
void updateTmf(float Tmf) {
	System.out.println("RUNNING UPDATETMF METHOD");
	System.out.println("BEFORE UPDATE="+tmf);
	this.tmf=Tmf;
	System.out.println("AFTER UPDATE="+Tmf);
}
String getName()
{
System.out.println("RUNNING GETNAME");
return this.name;
}
int getPrice()
{
System.out.println("RUNNING GETPRICE");
return this.price;
}
String getColor()
{
System.out.println("RUNNING GETCOLOR");
return this.color;
}
String getSize()
{
System.out.println("RUNNING GETSIZE");
return this.size;
}
String getWeight()
{
System.out.println("RUNNING GETWEIGHT");
return this.weight;
}
String getManfDate()
{
System.out.println("RUNNING GETMANFDATE");
return this.manfDate;
}
float getTmf()
{
System.out.println("RUNNING GETTMF");
return this.tmf;
}
void about(String name,int price,String color,String size,String weight,String manfDate,float tmf)
{
	System.out.println(name);
	System.out.println(price);
	System.out.println(color);
	System.out.println(size);
	System.out.println(weight);
	System.out.println(manfDate);
	System.out.println(tmf);
	}

}
