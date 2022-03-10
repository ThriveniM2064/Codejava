package method;

public class MoviesTester extends Movies {
	public static void main(String[] args)
	{
		Movies m=new Movies();
		ActionM am=new ActionM();
		horrormovie hormovie=new horrormovie();
		MoviesTester movietest=new MoviesTester();
		movietest.rating();
		m.displayDetails();
		m.update(3,"the crudes","5/06/2012",320);
		am.display();
		am.get("english","Kristine belson");
		hormovie.display();
		hormovie.date("oct-2020");
	}

}
