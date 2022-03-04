package method;

public class SoapTester {
	public static void main(String[] args)
	{
		Soap soap=new Soap();
		soap.name="santhoor";
		 String val=soap.getName();
		 System.out.println(val);
		 soap.price=27;
		 int val1=soap.getPrice();
		 System.out.println(val1);
		 soap.color="orange";
		 String val2=soap.getColor();
		 System.out.println(val2);
		 soap.size="ovel";
		 String val3=soap.getSize();
		 System.out.println(val3);
		 soap.weight="600gm";
		 String val4=soap.getWeight();
		 System.out.println(val4);
		 soap.manfDate="20-jan-2022";
		 String val5=soap.getManfDate();
		 System.out.println(val5);
		 soap.tmf=70.f;
		 float val6=soap.getTmf();
		 System.out.println(val6);
		 soap.update();
		 soap.updateName("dove");
		 soap.updatePrice(70);
		 soap.updateColor("waight");
		 soap.updateSize("circle");
		 soap.updateManfDate("08-dec-2021");
		 soap.updateWeight("50gm");
		 soap.updateTmf(60.0f);
         soap.about("dettol",45,"blue", "3inche","45gm","12-jun-2020",50.0f);
	}

}
