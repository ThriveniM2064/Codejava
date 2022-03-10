package method;

public class horrormovie extends Movies {
	String relieaseon;
	void display()
	{
		System.out.println("realise on"+this.relieaseon);
	}
	void date(String Realeaseon)
	{
		this.relieaseon=Realeaseon;
		System.out.println(relieaseon);
	}
	

}
