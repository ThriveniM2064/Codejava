package method;

public class SongTester {
	
public static void main(String []args) {
	Song song=new Song();
	song.execution();
System.out.println(song.sname);
song.name="xyz";
song.sname="hello_hello";
song.lang="english";
song.writer="hamsalekha";
song.length="7:00";
System.out.println(song.lang);
song.updateName();
song.about();
song.updateName("rashmi");
song.updatelength();
song.updatelength("4:00");
song.update("spb", "6:00", "ede_thumbi_haduvenu", "kannada","kamal_hasan");
}
}
