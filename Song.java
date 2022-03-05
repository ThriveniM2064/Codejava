package method;

public class Song {
	String name;
    String length;
	enum type{
		ROCK,MELODY,SOUL,HIPHOP
	}
	String sname;
    String lang;
	String writer;
	void execution()
	{
		System.out.println("Running execution method");
		System.out.println(this.length);
		System.out.println(this.lang);
	}
	void about()
	{
		System.out.println("Running about method");
		System.out.println(this.name);
		System.out.println(this.length);
		System.out.println(type.MELODY);
		System.out.println(this.sname);
		System.out.println(this.lang);
		System.out.println(this.writer);
	}
	void updateName()
	{
		System.out.println("Running updateName method");
		System.out.println("BEFORE UPDATING NAME="+name);
		this.name="Vasuki";
		System.out.println("AFTER UPDATING NAME="+name);
	}
	void updateName(String Name) 
	{
		System.out.println("Running updatename over method");
		System.out.println("BEFORE UPDATING NAME="+name);
		this.name=Name;
		System.out.println("AFTER UPDATING NAME="+Name);
		
	}
	void updatelength()
	{
		System.out.println("Running updateLength method");
		System.out.println("BEFORE UPDATING "+length);
		this.length="4:45";
		System.out.println("AFTER UPDATING  "+length);
	}
	void updatelength(String Length)
	{
		System.out.println("Running updatelength over method");
		System.out.println("BEFORE UPDATING LENGTHE="+length);
		this.length=Length;
		System.out.println("AFTER UPDATING LENGTH="+Length);
	}
	void update(String name,String length,String sname,String lang,String writer)
	{
		this.updateName(name);
		this.updatelength(length);
		this.sname=sname;
       System.out.println("singer name="+sname);
		this.lang=lang;
		System.out.println("language name="+lang);
		this.writer=writer;	
		System.out.println("writer name="+writer);
	}

}
