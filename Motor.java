package method;

public class Motor {
	int rpm;
	boolean working;
	String fueltype;
	void run()
	{
		this.rpm=120;
		System.out.println("the rpm of motor--"+rpm);
	}
void Stop()
{
	System.out.println("the motor is stop");
}
}
