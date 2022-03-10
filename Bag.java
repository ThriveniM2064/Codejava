package method;

public class Bag {
	boolean waterproof;
	enum type{
		BACKPACK,LAPTOP,SATCHEL
	}
	enum gender{
		MALE,FEMALE,OTHER
	}
	double price;
	Bag()
	{//super class
		System.out.println("no argument constr");
	}
	Bag(boolean proof,double price)
	{//super class
		this.waterproof=true;
		System.out.println("it is a waterproof bag");
		this.price=price;
		System.out.println("bag price was="+price);
		System.out.println(type.LAPTOP);
		System.out.println(gender.MALE);
	}

}
