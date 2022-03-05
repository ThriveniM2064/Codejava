package method;

public class ShoeTester {
	public static void main(String[] things) {
		// TODO Auto-generated method stub
		Shoe shoe=new Shoe(500.0d);
		shoe.brand="PUMA";
		System.out.println(shoe.price);
		System.out.println(shoe.brand);
		Shoe shoe1=new Shoe(700.0d);
		shoe1.Displaydetails();
		shoe1.Changeprice();
		
		
		

	}

}
