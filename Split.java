package method;

public class Split {
void splite(String name,int n)
{
	int size=name.length();
	int psize;
	if(size%n!=0)
	{
		System.out.println("Invalid split string");
	}
	return;
	psize=(size/n);
	for(int i=0;i<size;i++) {
		if(i%psize==0)
			System.out.println(name.charAt(i));
	}
	
}
}
