package method;

public class AmericanTBag  extends Bag{
	int wallet;
	int noOfCompartments;
	AmericanTBag()
	{
		System.out.println("no arguments are constructed");
	}
	AmericanTBag(int wallet,int noOfCompartments)
	{
		this.wallet=wallet;
		System.out.println("wallets number is="+wallet);
	}

}
