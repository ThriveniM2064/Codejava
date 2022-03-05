package method;

public class Movie {
	String[] moviename=new String[25];
	int temp=0;
	void addmoviename(String moviename)
	{
		System.out.println("movie names="+moviename);
		moviename=this.moviename[temp];
		temp=temp+1;
		
	}
	void display()
	{
		for(int i=0;i<moviename.length;i++)
		{
			System.out.println("Displaying the movie names");
			String movienames=this.moviename[i];
			System.out.println(movienames);
		}
	}
	}
