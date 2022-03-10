package method;

public class Movies {
	
	int ratings;
	String title;
	String  pdate;
	int duration;
	 void displayDetails()
	 {
		 System.out.println(this.ratings);
		 System.out.println(this.title);
		 System.out.println(this.pdate);
		 System.out.println(this.duration);
	 }
	 void rating()
	 {
		 this.ratings=5;
		System.out.println("ratings"); 
	 }
	void update(int ratings,String title,String pdate,int duration)
	 {
		this.ratings=ratings;
		System.out.println("ratings is="+ratings);
		this.title=title;
		System.out.println("Title name is="+title);
		this.pdate=pdate;
		System.out.println("producing date="+pdate);
		this.duration=duration;
		System.out.println("duration of movie="+duration);
	 }
	}

