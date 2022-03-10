package method;

class ActionM extends Movies {

	
	String lang;
	String producer;
	void display()
	{
		System.out.println(this.lang);
		System.out.println(this.producer);
	}
	void get(String Lang,String Producer)
	{
		this.lang=Lang;
		System.out.println("language is="+lang);
		this.producer=Producer;
		System.out.println("producer name="+producer);
	}
	
	
}
	


