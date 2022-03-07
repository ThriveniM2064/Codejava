package method;

public class chocalate {
	double money=50;
	double chocolateprice=15;
	double fixmoney=money;
	void buy(int noofchocolate)
	{
		double tempmoney=noofchocolate*chocolateprice;
		this.money=this.money-tempmoney;
		if(fixmoney>=tempmoney)
		{
			System.out.println("you can buy a chocolate");
		}
		else
		{
			System.out.println("you can't buy a chocolate");
		}
	}
	
}
